package com.example.demo;

import com.example.demo.dominio.servicio.AdministradorServicio;
import com.example.demo.dominio.servicio.ContenidoServicio;
import com.example.demo.dominio.servicio.GeneroServicio;
import com.example.demo.persistencia.entidades.Administrador;
import com.example.demo.persistencia.entidades.Contenido;
import com.example.demo.persistencia.entidades.Genero;
import com.example.demo.persistencia.entidades.Reparto;
import com.example.demo.persistencia.entidades.Role;
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
