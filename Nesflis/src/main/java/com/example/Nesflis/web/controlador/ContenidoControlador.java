package com.example.Nesflis.web.controlador;

import com.example.Nesflis.dominio.servicio.ContenidoServicioImpl;
import com.example.Nesflis.persistencia.entidad.Administrador;
import com.example.Nesflis.persistencia.entidad.Contenido;
import com.example.Nesflis.persistencia.entidad.Genero;
import com.example.Nesflis.persistencia.entidad.Reparto;
import com.example.Nesflis.persistencia.entidad.Pelicula;
import com.example.Nesflis.persistencia.entidad.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contenido")
public class ContenidoControlador {

    private final ContenidoServicioImpl contenidoServicio;

    @Autowired
    public ContenidoControlador(ContenidoServicioImpl contenidoServicio) {
        this.contenidoServicio = contenidoServicio;
    }

    @GetMapping
    public List<Contenido> listarContenidos() {
        return contenidoServicio.listarContenido();
    }

    @GetMapping("/{id}")
    public Optional<Contenido> obtenerContenidoPorId(@PathVariable Long id) {
        return contenidoServicio.listarContenido().stream()
                .filter(contenido -> contenido.getId_contenido().equals(id))
                .findFirst();
    }

    @DeleteMapping("/{id}")
    public void eliminarContenido(@PathVariable Long id) {
        contenidoServicio.eliminarContenido(id);
    }

    @PutMapping("/{id}")
    public Optional<Contenido> actualizarContenido(@PathVariable Long id, @RequestBody Contenido contenido) {
        return contenidoServicio.actualizarContenido(id, contenido.getTitulo(), contenido.getDescripcion(), contenido.getAnio_Estreno(), contenido.getClasificacion());
    }

    @PostMapping("/pelicula")
    public Pelicula agregarPelicula(@RequestBody Pelicula pelicula) {
        return contenidoServicio.agregarPelicula(pelicula, pelicula.getGeneros(), pelicula.getActores());
    }

    @PostMapping("/serie")
    public Serie agregarSerie(@RequestBody Serie serie) {
        return contenidoServicio.agregarSerie(serie, serie.getGeneros(), serie.getActores());
    }

    @GetMapping("/anio/{anio}")
    public List<Contenido> obtenerContenidosPorAnio(@PathVariable int anio) {
        return contenidoServicio.obtenerContenidosPorAnio(anio);
    }

    @PutMapping("/{id}/administrador")
    public void actualizarAdministradorContenido(@PathVariable Long id, @RequestBody Administrador administrador) {
        contenidoServicio.actualizarAdministradorContenido(id, administrador);
    }
}
