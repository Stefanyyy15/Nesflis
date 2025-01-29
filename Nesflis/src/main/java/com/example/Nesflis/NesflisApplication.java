package com.example.Nesflis;

import com.example.Nesflis.dominio.servicio.AdministradorServicioImpl;
import com.example.Nesflis.dominio.servicio.ContenidoServicio;
import com.example.Nesflis.dominio.servicio.ContenidoServicioImpl;
import com.example.Nesflis.dominio.servicio.PerfilServicioImpl;
import com.example.Nesflis.dominio.servicio.PlanServicioImpl;
import com.example.Nesflis.dominio.servicio.UsuarioServicioImpl;
import com.example.Nesflis.persistencia.entidad.Administrador;
import com.example.Nesflis.persistencia.entidad.Contenido;
import com.example.Nesflis.persistencia.entidad.Genero;
import com.example.Nesflis.persistencia.entidad.Pelicula;
import com.example.Nesflis.persistencia.entidad.Perfil;
import com.example.Nesflis.persistencia.entidad.Plan;
import com.example.Nesflis.persistencia.entidad.Reparto;
import com.example.Nesflis.persistencia.entidad.Serie;
import com.example.Nesflis.persistencia.entidad.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NesflisApplication {

    public static void main(String[] args) throws ParseException {
        ConfigurableApplicationContext contexto = SpringApplication.run(NesflisApplication.class, args);
        ContenidoServicio contenidoService = contexto.getBean(ContenidoServicio.class);
        AdministradorServicioImpl adminImp = contexto.getBean(AdministradorServicioImpl.class);
        PerfilServicioImpl perfilService = contexto.getBean(PerfilServicioImpl.class);
        UsuarioServicioImpl usuarioService = contexto.getBean(UsuarioServicioImpl.class);
        PlanServicioImpl planService = contexto.getBean(PlanServicioImpl.class);

//        List<Contenido> contenidoFavorito = new ArrayList<>();
//// Intentar obtener el contenido con el ID 15
//        Optional<Contenido> contenido1Optional = contenidoService.encontrarContenidoPorId(15L);
//        contenido1Optional.ifPresent(contenidoFavorito::add);
//// Intentar obtener el contenido con el ID 20
//        Optional<Contenido> contenido2Optional = contenidoService.encontrarContenidoPorId(20L);
//        contenido2Optional.ifPresent(contenidoFavorito::add);
//// Intentar obtener el contenido con el ID 10
//        Optional<Contenido> contenido3Optional = contenidoService.encontrarContenidoPorId(10L);
//        contenido3Optional.ifPresent(contenidoFavorito::add);
//
//        System.out.println("Contenido 15 encontrado: " + contenido1Optional.isPresent());
//        System.out.println("Contenido 20 encontrado: " + contenido2Optional.isPresent());
//        System.out.println("Contenido 10 encontrado: " + contenido3Optional.isPresent());
//
//        System.out.println(contenidoFavorito);
//        Perfil nuevoPerfil = new Perfil();
//        nuevoPerfil.setNombre("Perfil de Stefa");
//        Optional<Usuario> usuarioOptional = usuarioService.encontrarUsuario(3L);
//        if (usuarioOptional.isPresent()) {
//            nuevoPerfil.setUsuario(usuarioOptional);
//        } else {
//            System.err.println("Usuario no encontrado");
//            return;
//        }
//
////        nuevoPerfil.setContenidosFavoritos(contenidoFavorito);
//
//        perfilService.savePerfil(nuevoPerfil);
//        System.out.println("Perfil guardado con éxito: " + nuevoPerfil);

//        
//       Genero gen1 = new Genero();
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
    }

}
