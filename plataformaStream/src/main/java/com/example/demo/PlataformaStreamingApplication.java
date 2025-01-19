package com.example.demo;

import com.example.demo.controlador.ContenidoServicio;
import com.example.demo.controlador.roleservice;
import com.example.demo.modelo.entidades.Administrador;
import com.example.demo.modelo.entidades.Contenido;
import com.example.demo.modelo.entidades.Genero;
import com.example.demo.modelo.entidades.Reparto;
import com.example.demo.modelo.entidades.Role;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PlataformaStreamingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext contexto = SpringApplication.run(PlataformaStreamingApplication.class, args);

       ContenidoServicio contenidoService = contexto.getBean(ContenidoServicio.class);
 
//       1. Agregar Contenido

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
//
//        System.out.println("Contenido agregado correctamente.");

//        2. Eliminar Contenido
//         
//        contenidoService.eliminarContenido(Long.valueOf("1"));
//
//        System.out.println("Contenido eliminado correctamente.");

//        List<Genero> generos = contenidoService.obtenerGenerosDeUnContenido(Long.valueOf("1"));
//        System.out.println("Generos del Contenido 1:");
//        for (Genero g : generos) {
//            System.out.println(g);
//        }
//        
//        Administrador admin1 = new Administrador();
//        admin1.setNombre("Juankis");
//        admin1.setCorreo("juankisPotaxie@gmail.com");
//        admin1.setContraseña("amoaU2");
//
//        contenidoService.actualizarAdministradorContenido(Long.valueOf("1"), admin1);
//
//    }

    }}
