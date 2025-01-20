package com.example.demo.controlador;

import com.example.demo.modelo.entidades.Administrador;
import com.example.demo.modelo.entidades.Contenido;
import com.example.demo.modelo.entidades.Genero;
import com.example.demo.modelo.entidades.Reparto;
import com.example.demo.modelo.repositorio.AdministradorRepositorio;
import com.example.demo.modelo.repositorio.ContenidoRepositorio;
import com.example.demo.modelo.repositorio.GeneroRepositorio;
import com.example.demo.modelo.repositorio.RepartoRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ContenidoServicio {

    private final ContenidoRepositorio contenidoRepository;
    private GeneroRepositorio generoRepository;
    private RepartoRepositorio repartoRepository;

    @Autowired
    private AdministradorRepositorio adminRepository;

    public ContenidoServicio(ContenidoRepositorio contenidoRepository, RepartoRepositorio repartoReposiroty, GeneroRepositorio generoRepoditory) {
        this.contenidoRepository = contenidoRepository;
        this.generoRepository = generoRepoditory;
        this.repartoRepository = repartoReposiroty;
    }

    public Contenido saveContenido(Contenido contenido) {
        try {
            return contenidoRepository.save(contenido);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Error al guardar el contenido: " + e.getMessage(), e);
        }
    }

    @Transactional
    public void agregarContenido(Contenido contenido, List<Genero> generos, List<Reparto> reparto) {
        try {
            contenido.setGeneros(generos);
            contenido.setActores(reparto);
            generoRepository.saveAll(generos);
            repartoRepository.saveAll(reparto);
            contenidoRepository.save(contenido);
            System.out.println("Contenido agregado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al agregar contenido: ");
        }
    }

    @Transactional
    public void eliminarContenido(Long contenidoId) {
        Optional<Contenido> contenidoOptional = contenidoRepository.findById(contenidoId);

        if (contenidoOptional.isPresent()) {
            contenidoRepository.deleteById(contenidoId);
            System.out.println("Contenido eliminado correctamente.");
        } else {
            System.out.println("Contenido con ID " + contenidoId + " no encontrado.");
        }
    }

    @Transactional
    public List<Genero> obtenerGenerosDeUnContenido(Long contenidoId) {
        Optional<Contenido> optionalContenido = contenidoRepository.findById(contenidoId);

        return optionalContenido.map(Contenido::getGeneros).orElse(Collections.emptyList());
    }

    @Transactional
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
    
    public List<Contenido> obtenerContenidosPorAnio(int anio) {
        return contenidoRepository.findContenidosByAnioEstreno(anio);
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
//    

