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
import java.time.LocalDate;
import java.time.LocalDateTime;
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
        
        
//        
//
//// Crear un nuevo Perfil
//Perfil nuevoPerfil = new Perfil();
//nuevoPerfil.setNombre("Perfil de Juan");
//
//// Recuperar el Usuario existente (suponiendo que ya tienes el id del Usuario)
//Usuario usuario = usuarioService.encontrarUsuario(1L)  // O el id del Usuario que desees
//        .orElseThrow(() -> new RuntimeException("Usuario con id 1 no encontrado"));
//
//// Recuperar el ContenidoFavorito existente (suponiendo que también tienes su id)
//Contenido contenidoFavorito = contenidoService.encontrarContenidoPorId(1L)  // O el id del ContenidoFavorito
//        .orElseThrow(() -> new RuntimeException("Contenido favorito con id 1 no encontrado"));
//
//// Asociar el Usuario y el ContenidoFavorito al Perfil
//nuevoPerfil.setUsuario(Optional.of(usuario));
//nuevoPerfil.setContenidoFavorito(Optional.of(contenidoFavorito));  // Asociamos el ContenidoFavorito al Perfil
//// Guardar el Perfil con el Usuario y el ContenidoFavorito asignados
//perfilService.savePerfil(nuevoPerfil);


//        //Crear ´plan
//        Plan nuevoPlan = new Plan();
//        nuevoPlan.setNombre("Plan Basico");
//        nuevoPlan.setPrecio_mensual(12.000);
//        nuevoPlan.setCalidad_video("2K");
//        nuevoPlan.setNum_perfiles(5);
//        planService.savePlan(nuevoPlan); 
// 

// Crear un nuevo Usuario y asociarlo al Plan recuperado por ID
//// Crear un nuevo Usuario
//Usuario nuevoUsuario = new Usuario();
//nuevoUsuario.setNombre("Nosh coco");
//nuevoUsuario.setCorreo("aihspaque@email.com");
//nuevoUsuario.setContrasena("nose123");
//Plan plan = planService.encontrarPlan(1L)  // O el id del Usuario que desees
//        .orElseThrow(() -> new RuntimeException("pln con id 1 no encontrado"));
//nuevoUsuario.setPlan(Optional.of(plan));
//// Asignar la fecha de creación (por ejemplo, la fecha actual)
//Date fecha_registro = new SimpleDateFormat("dd/MM/yyyy").parse("27/05/2025"); 
//
// usuarioService.saveUsuario(nuevoUsuario);

        
//        // Crear un nuevo usuario
// Usuario nuevoUsuario = new Usuario();
// nuevoUsuario.setNombre("Nosh coco");
// nuevoUsuario.setCorreo("aihspaque@email.com");
// nuevoUsuario.setContrasena("nose123");
// usuarioService.saveUsuario(nuevoUsuario);

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
