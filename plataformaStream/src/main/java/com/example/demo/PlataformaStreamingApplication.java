package com.example.demo;

import com.example.demo.controlador.AdministradorServicio;
import com.example.demo.controlador.ContenidoServicio;
import com.example.demo.controlador.GeneroServicio;
import com.example.demo.modelo.entidades.Administrador;
import com.example.demo.modelo.entidades.Contenido;
import com.example.demo.modelo.entidades.Genero;
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
        
//
    }}
