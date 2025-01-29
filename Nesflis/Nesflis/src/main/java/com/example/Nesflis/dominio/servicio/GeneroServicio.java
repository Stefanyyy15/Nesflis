package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.persistencia.entidad.Genero;
import java.util.List;
import java.util.Optional;

public interface GeneroServicio {
    Genero saveGenero(Genero genero);
    void delGenero(Long generoId);
    List<Genero> listarGeneros();
    Optional<Genero> encontrarGenero(Long generoId);
    Optional<Genero> actualizarGenero(Long id, String nuevoNombre);
}