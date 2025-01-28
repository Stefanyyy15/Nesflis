package com.example.Nesflis;

import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.Nesflis.dominio.servicio.AdministradorServicioImpl;
import com.example.Nesflis.dominio.servicio.ContenidoServicio;
import com.example.Nesflis.dominio.servicio.PerfilServicioImpl;
import com.example.Nesflis.dominio.servicio.PlanServicioImpl;
import com.example.Nesflis.dominio.servicio.UsuarioServicioImpl;

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
