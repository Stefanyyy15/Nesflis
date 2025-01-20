package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.controlador.AdministradorServicio;
import com.example.demo.controlador.ContenidoServicio;
import com.example.demo.controlador.GeneroServicio;
import com.example.demo.controlador.PeliculaServicio;
import com.example.demo.controlador.PerfilServicio;
import com.example.demo.controlador.PlanServicio;
import com.example.demo.controlador.RepartoServicio;
import com.example.demo.controlador.RoleServicio;
import com.example.demo.modelo.entidades.Serie;
import com.example.demo.modelo.servicio.SerieServicio;

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
        SerieServicio serieService = contexto.getBean(SerieServicio.class);

        // 1. Agregar Serie
        Serie serie1 = new Serie(10, 2, "Breaking Bad", "Un profesor se convierte en narcotraficante", 2008, "+12", null, null);
        serieService.guardarSerie(serie1);
        System.out.println("Serie guardada: " + serie1.getTitulo());
//
// // 2. Listar todas las series
// System.out.println("Listado de series:");
// serieService.obtenerSeries().forEach(serie -> System.out.println(serie.getTitulo()));
//
// // 3. Encontrar Serie por ID
// Optional<Serie> serieEncontrada = serieService.obtenerSeriePorId(serie1.getId());
// serieEncontrada.ifPresent(serie -> System.out.println("Serie encontrada por ID: " + serie.getTitulo()));
//
// // 4. Eliminar Serie
// serieService.eliminarSerie(serie1.getId());
// System.out.println("Serie eliminada con ID: " + serie1.getId());

        // 5. Intentar encontrar la serie eliminada
// Optional<Serie> serieEliminada = serieService.obtenerSeriePorId(serie1.getId());
// if (serieEliminada.isEmpty()) {
//     System.out.println("La serie fue eliminada correctamente.");
// } else {
//     System.out.println("Error: La serie aún existe.");
    }
}
