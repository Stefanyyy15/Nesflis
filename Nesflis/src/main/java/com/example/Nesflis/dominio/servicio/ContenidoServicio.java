package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.persistencia.entidad.Administrador;
import com.example.Nesflis.persistencia.entidad.Contenido;
import com.example.Nesflis.persistencia.entidad.Genero;
import com.example.Nesflis.persistencia.entidad.Reparto;
import java.util.List;
import java.util.Optional;

public interface ContenidoServicio {
    List<Contenido> listarContenido();
    Contenido saveContenido(Contenido contenido);
    void actualizarAdministradorContenido(Long contenidoId, Administrador administrador);
    void eliminarContenido(Long contenidoId);
    void agregarContenido(Contenido contenido, List<Genero> generos, List<Reparto> reparto);
    List<Contenido> obtenerContenidosPorAnio(int anio);
    Optional<Contenido> actualizarContenido(Long contenidoId, String nuevoTitulo, String nuevaDescripcion, int nuevoAnio, String nuevaClasificacion);
}
