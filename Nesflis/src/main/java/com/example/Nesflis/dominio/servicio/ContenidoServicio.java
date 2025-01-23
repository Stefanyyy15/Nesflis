package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.persistencia.entidad.Administrador;
import com.example.Nesflis.persistencia.entidad.Contenido;
import com.example.Nesflis.persistencia.entidad.Genero;
import com.example.Nesflis.persistencia.entidad.Pelicula;
import com.example.Nesflis.persistencia.entidad.Reparto;
import com.example.Nesflis.persistencia.entidad.Serie;
import java.util.List;
import java.util.Optional;

public interface ContenidoServicio {
    List<Contenido> listarContenido();
    Contenido saveContenido(Contenido contenido);
    void actualizarAdministradorContenido(Long contenidoId, Administrador administrador);
    void eliminarContenido(Long contenidoId);
    List<Contenido> obtenerContenidosPorAnio(int anio);
    Optional<Contenido> actualizarContenido(Long contenidoId, String nuevoTitulo, String nuevaDescripcion, int nuevoAnio, String nuevaClasificacion);
    Serie agregarSerie(Serie serie, List<Genero> generos, List<Reparto> reparto);
    Pelicula agregarPelicula(Pelicula pelicula, List<Genero> generos, List<Reparto> reparto);
    Optional<Contenido> encontrarContenidoPorId(Long id);
}
