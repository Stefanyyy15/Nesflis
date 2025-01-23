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

//        Administrador admin1 = new Administrador();
//        admin1.setNombre("Enano");
//        admin1.setCorreo("Enano@gmail.com");
//        admin1.setContraseña("olaMellamoKevin");
//        adminImp.saveAdmin(admin1);
//
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
//
//
//        // Crear el Plan
//        Plan plan = new Plan("Basico", 500, "120p", 2);
//        plan = planService.savePlan(plan);  // Guarda el plan en la base de datos
//
//// Convertir la fecha
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//        Date fechaNacimiento = sdf.parse("10-10-2010");
//
//// Crear el Usuario
//        Usuario usuario = new Usuario();
//        usuario.setNombre("juano");
//        usuario.setCorreo("lecorreodejuano@correo.com");
//        usuario.setFecha_registro(fechaNacimiento);
//        usuario.setPlan(plan);
//        usuario.setContrasena("olaQtal");
//
//// Guardar el Usuario en la base de datos
//        usuarioService.saveUsuario(usuario);  // Asegúrate de que el servicio de Usuario esté configurado
//
//// Crear el Contenido Favorito (ya deberías tener el objeto 'serie' listo)
//        Optional<Contenido> serie = contenidoService.encontrarContenidoPorId(1L);  // Esto depende de cómo obtienes la serie
//
//// Crear el Perfil
//        Perfil nuevoPerfil = new Perfil();
//        nuevoPerfil.setNombre("Perfil de Juan");
//        nuevoPerfil.setUsuario(usuario);  // Aquí se asocia al Usuario que ya fue guardado
//        nuevoPerfil.setContenidoFavorito(serie);  // Asigna el contenido favorito
//
//// Guardar el Perfil en la base de datos
//        perfilService.savePerfil(nuevoPerfil);  // Guarda el perfil después de guardar el usuario
//
//// Si deseas agregar el perfil a la lista de perfiles del usuario:
//        List<Perfil> perfiles = usuario.getPerfiles();  // Esto ya debería existir como una lista de perfiles
//        perfiles.add(nuevoPerfil);
//        usuario.setPerfiles(perfiles);  // Actualiza la lista de perfiles del usuario
//
//// Luego puedes guardar de nuevo el usuario si es necesario
//        usuarioService.saveUsuario(usuario);  // Guardamos nuevamente el usuario con su nuevo perfil asociado

    }

}
