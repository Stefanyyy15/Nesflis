package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.dominio.repositorio.AdministradorRepositorio;
import com.example.Nesflis.dominio.repositorio.ContenidoRepositorio;
import com.example.Nesflis.dominio.repositorio.GeneroRepositorio;
import com.example.Nesflis.dominio.repositorio.RepartoRepositorio;
import com.example.Nesflis.persistencia.entidad.Administrador;
import com.example.Nesflis.persistencia.entidad.Contenido;
import com.example.Nesflis.persistencia.entidad.Genero;
import com.example.Nesflis.persistencia.entidad.Pelicula;
import com.example.Nesflis.persistencia.entidad.Reparto;
import com.example.Nesflis.persistencia.entidad.Serie;
import jakarta.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class ContenidoServicioImpl implements ContenidoServicio {

    @Autowired
    private ContenidoRepositorio contenidoRepository;
    @Autowired
    private GeneroRepositorio generoRepository;
    @Autowired
    private RepartoRepositorio repartoRepository;
    @Autowired
    private AdministradorRepositorio adminRepository;

    @Override
    public Contenido saveContenido(Contenido contenido) {
        try {
            return contenidoRepository.save(contenido);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Error al guardar el contenido: " + e.getMessage(), e);
        }
    }

    @Transactional
    @Override
    public void eliminarContenido(Long contenidoId) {
        Optional<Contenido> contenidoOptional = contenidoRepository.findById(contenidoId);

        if (contenidoOptional.isPresent()) {
            contenidoRepository.deleteById(contenidoId);
            System.out.println("Contenido eliminado correctamente.");
        } else {
            System.out.println("Contenido con ID " + contenidoId + " no encontrado.");
        }
    }
    
    @Override
    public Optional<Contenido> encontrarContenidoPorId(Long id) {
        return contenidoRepository.findById(id);
    }

    @Transactional
    @Override
    public void actualizarAdministradorContenido(Long contenidoId, Administrador administrador) {
        try {
            final Administrador administradorPersistido = adminRepository.save(administrador);

            Optional<Contenido> optionalContenido = contenidoRepository.findById(contenidoId);
            if (optionalContenido.isPresent()) {
                Contenido contenido = optionalContenido.get();
                contenido.setAdministrador(administradorPersistido);
                contenidoRepository.save(contenido);
            } else {
                System.out.println("Contenido con ID " + contenidoId + " no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar el administrador del contenido: " + e);
        }
    }

    @Override
    public List<Contenido> obtenerContenidosPorAnio(int anio) {
        return contenidoRepository.findContenidosByAnioEstreno(anio);
    }

    @Override
    public List<Contenido> listarContenido() {
        return contenidoRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Contenido> actualizarContenido(Long contenidoId, String nuevoTitulo, String nuevaDescripcion, int nuevoAnio, String nuevaClasificacion) {
        Optional<Contenido> contenidoOpt = contenidoRepository.findById(contenidoId);

        if (contenidoOpt.isPresent()) {
            Contenido contenido = contenidoOpt.get();
            contenido.setTitulo(nuevoTitulo);
            contenido.setDescripcion(nuevaDescripcion);
            contenido.setAnio_Estreno(nuevoAnio);
            contenido.setClasificacion(nuevaClasificacion);

            contenidoRepository.save(contenido); // Guardar cambios
            return Optional.of(contenido);
        }

        System.out.println("Contenido con ID " + contenidoId + " no encontrado.");
        return Optional.empty();
    }

    @Transactional
    @Override
    public Pelicula agregarPelicula(Pelicula pelicula, List<Genero> generos, List<Reparto> reparto) {
        try {
            pelicula.setGeneros(generos);
            pelicula.setActores(reparto);
            generoRepository.saveAll(generos);
            repartoRepository.saveAll(reparto);
            return contenidoRepository.save(pelicula);
        } catch (Exception e) {
            throw new RuntimeException("Error al agregar la película: " + e.getMessage(), e);
        }
    }

    @Transactional
    @Override
    public Serie agregarSerie(Serie serie, List<Genero> generos, List<Reparto> reparto) {
        try {
            serie.setGeneros(generos);
            serie.setActores(reparto);
            generoRepository.saveAll(generos);
            repartoRepository.saveAll(reparto);
            return contenidoRepository.save(serie);
        } catch (Exception e) {
            throw new RuntimeException("Error al agregar la serie: " + e.getMessage(), e);
        }
    }

}

//       1. Agregar Contenido
//
//        Genero gen1 = new Genero();
//        gen1.setNombre("Utopico");
//        Genero gen2 = new Genero();
//        gen2.setNombre("Violencia");
//
//        Reparto rep1 = new Reparto();
//        rep1.setNombre("Bruno Diaz");
//        Reparto rep2 = new Reparto();
//        rep2.setNombre("Chespirito");
//
//        List<Genero> generos = new ArrayList<>();
//        generos.add(gen1);
//        generos.add(gen2);
//
//        List<Reparto> actores = new ArrayList<>();
//        actores.add(rep1);
//        actores.add(rep2);
//
//        Contenido contenido = new Contenido();
//        contenido.setTitulo("Perros espias 3");
//        contenido.setDescripcion("3 espias perros y un malvado gato. ¿Quien ganará?");
//        contenido.setAnio_Estreno(2023);
//        contenido.setClasificacion("+18");
//
//        contenidoService.agregarContenido(contenido, generos, actores);
//        2. Eliminar Contenido
//         
//        contenidoService.eliminarContenido(Long.valueOf("1"));
//          3. Listar generos de un contenido
//        List<Genero> generos = contenidoService.obtenerGenerosDeUnContenido(Long.valueOf("1"));
//        System.out.println("Generos del Contenido 1:");
//        for (Genero g : generos) {
//            System.out.println(g);
//        }
//        
//          4. Actualizar el administrador de un contenido
//        Administrador admin1 = new Administrador();
//        admin1.setNombre("Juankis");
//        admin1.setCorreo("juankisPotaxie@gmail.com");
//        admin1.setContraseña("amoaU2");
//
//        contenidoService.actualizarAdministradorContenido(Long.valueOf("1"), admin1);
//
//            5. Encontrar Contenido x Año JPQL
//        int anioBusqueda = 2023;
//        List<Contenido> contenidos = contenidoService.obtenerContenidosPorAnio(anioBusqueda);
//
//        if (contenidos.isEmpty()) {
//            System.out.println("No se encontraron contenidos del año " + anioBusqueda);
//        } else {
//            System.out.println("Contenidos del año " + anioBusqueda + ":");
//            for (Contenido contenido : contenidos) {
//                System.out.println(contenido.getTitulo());
//            }
//        }
//Actualizar contenido
//Long contenidoId = 1L; // ID del contenido a actualizar
//String nuevoTitulo = "Título actualizado";
//String nuevaDescripcion = "Descripción actualizada";
//int nuevoAnio = 2025;
//String nuevaClasificacion = "+13";
//
//Optional<Contenido> contenidoActualizado = contenidoService.actualizarContenido(contenidoId, nuevoTitulo, nuevaDescripcion, nuevoAnio, nuevaClasificacion);
//
//contenidoActualizado.ifPresent(contenido -> 
//    System.out.println("Contenido actualizado: " + contenido.getTitulo() + " - Año: " + contenido.getAnioEstreno()));
//    
//Genero genero = new Genero();
//        genero.setNombre("Aventura");
//
//        Reparto actor = new Reparto();
//        actor.setNombre("John Doe");
//
//        List<Genero> generos = List.of(genero);
//        List<Reparto> reparto = List.of(actor);
//
//        Pelicula pelicula = new Pelicula();
//        pelicula.setTitulo("Película de Prueba");
//        pelicula.setDescripcion("Descripción de prueba");
//        pelicula.setAnio_Estreno(2025);
//        pelicula.setClasificacion("+13");
//        pelicula.setDuracion(120);
//        pelicula.setGeneros(generos);
//        pelicula.setActores(reparto);
//
//        contenidoService.agregarPelicula(pelicula, generos, reparto);
//Agregar Pelicula
//Genero genero = new Genero();
//        genero.setNombre("Accion");
//        Genero genero2 = new Genero();
//        genero2.setNombre("Carros");
//
//        Reparto actor = new Reparto();
//        actor.setNombre("Vin Diesel");
//        Reparto actor2 = new Reparto();
//        actor2.setNombre("Sung Kang");
//
//        List<Genero> generos = List.of(genero, genero2);
//        List<Reparto> reparto = List.of(actor, actor2);
//
//        Pelicula pelicula = new Pelicula();
//        pelicula.setTitulo("Rapidos y furiosos");
//        pelicula.setDescripcion("carros, gasolina y familia");
//        pelicula.setAnio_Estreno(2025);
//        pelicula.setClasificacion("+13");
//        pelicula.setDuracion(120);
//        pelicula.setImagenUrl("https://i.ytimg.com/vi/eoOaKN4qCKw/maxresdefault.jpg");
//        pelicula.setGeneros(generos);
//        pelicula.setActores(reparto);
//
//        contenidoService.agregarPelicula(pelicula, generos, reparto);

//Agregar Serie
//        Genero gen1 = new Genero();
//        gen1.setNombre("Drama");
//        Genero gen2 = new Genero();
//        gen2.setNombre("Suspenso");
//
//// Crear instancias de los actores
//        Reparto rep1 = new Reparto();
//        rep1.setNombre("Elena Smith");
//        Reparto rep2 = new Reparto();
//        rep2.setNombre("John Doe");
//
//// Crear listas de géneros y reparto
//        List<Genero> generos = new ArrayList<>();
//        generos.add(gen1);
//        generos.add(gen2);
//
//        List<Reparto> actores = new ArrayList<>();
//        actores.add(rep1);
//        actores.add(rep2);
//
//// Crear la serie
//        Serie serie = new Serie();
//        serie.setTitulo("Misterios No Resueltos");
//        serie.setDescripcion("Una serie que explora misterios no resueltos a lo largo de la historia.");
//        serie.setAnio_Estreno(2025);
//        serie.setClasificacion("+18");
//        serie.setCapitulos(20);
//        serie.setNum_temporadas(3);
//        serie.setImagenUrl("https://example.com/serie.jpg");
//
//// Llamar al servicio para agregar la serie
//        contenidoService.agregarSerie(serie, generos, actores);
