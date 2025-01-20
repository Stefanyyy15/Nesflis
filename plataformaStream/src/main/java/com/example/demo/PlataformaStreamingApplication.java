package com.example.demo;

import com.example.demo.controlador.AdministradorServicio;
import com.example.demo.controlador.ContenidoServicio;
import com.example.demo.controlador.GeneroServicio;
import com.example.demo.controlador.PeliculaServicio;
import com.example.demo.controlador.PerfilServicio;
import com.example.demo.controlador.PlanServicio;
import com.example.demo.controlador.RepartoServicio;
import com.example.demo.controlador.RoleServicio;
import com.example.demo.modelo.entidades.Administrador;
import com.example.demo.modelo.entidades.Contenido;
import com.example.demo.modelo.entidades.Genero;
import com.example.demo.modelo.entidades.Pelicula;
import com.example.demo.modelo.entidades.Perfil;
import com.example.demo.modelo.entidades.Plan;
import com.example.demo.modelo.entidades.Reparto;
import com.example.demo.modelo.entidades.Role;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
          
    }
}
