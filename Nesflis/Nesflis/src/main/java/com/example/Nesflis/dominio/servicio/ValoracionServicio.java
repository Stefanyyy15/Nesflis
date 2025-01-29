package com.example.Nesflis.dominio.servicio;
import com.example.Nesflis.persistencia.entidad.Valoracion;
import java.util.List;
import java.util.Optional;

public interface ValoracionServicio {
    
    Valoracion saveValoracion(Valoracion valoracion);
    void deleteValoracion(Long valoracionId);
    List<Valoracion> listarValoraciones();
    Optional<Valoracion> encontrarValoracion(Long valoracionId);
    List<Valoracion> encontrarPorTituloContenido(String tituloContenido);
}
