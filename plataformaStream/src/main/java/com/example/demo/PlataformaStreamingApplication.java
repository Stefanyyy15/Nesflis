package com.example.demo;

import com.example.demo.controlador.AdministradorServicio;
import com.example.demo.controlador.ContenidoServicio;
import com.example.demo.controlador.GeneroServicio;
import com.example.demo.controlador.PeliculaServicio;
import com.example.demo.controlador.PerfilServicio;
import com.example.demo.controlador.PlanServicio;
import com.example.demo.controlador.RepartoServicio;
import com.example.demo.controlador.RoleServicio;
import com.example.demo.controlador.UsuarioServicio;
import com.example.demo.modelo.servicio.SerieServicio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PlataformaStreamingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext contexto = SpringApplication.run(PlataformaStreamingApplication.class, args);

        ContenidoServicio contenidoService = contexto.getBean(ContenidoServicio.class);
        AdministradorServicio adminService = contexto.getBean(AdministradorServicio.class);
        GeneroServicio generoService = contexto.getBean(GeneroServicio.class);
        PeliculaServicio peliculaService = contexto.getBean(PeliculaServicio.class);
        PerfilServicio perfilService = contexto.getBean(PerfilServicio.class);
        PlanServicio planService = contexto.getBean(PlanServicio.class);
        RepartoServicio repartoService = contexto.getBean(RepartoServicio.class);
        RoleServicio roleService = contexto.getBean(RoleServicio.class);
        UsuarioServicio usuarioServicio = contexto.getBean(UsuarioServicio.class);
        SerieServicio serieServicio = contexto.getBean(SerieServicio.class);

        
// Crear una serie
Serie nuevaSerie = new Serie();
nuevaSerie.setTitulo("La Casa );
nuevaSerie.setDescripcion("No");
nuevaSerie.setAnio_Estreno(2017);
nuevaSerie.setClasificacion("+18");
nuevaSerie.setCapitulos(22);
nuevaSerie.setNum_temporadas(5);

// Llamar al servicio para guardar la serie
serieServicio.saveSerie(nuevaSerie);

    }
}
