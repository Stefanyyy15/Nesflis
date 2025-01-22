
package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.persistencia.entidad.Reparto;
import java.util.List;
import java.util.Optional;

public interface RepartoServicio {
    Reparto saveReparto(Reparto reparto);
    void delReparto(Long repartoId);
    List<Reparto> listarReparto();
    Optional<Reparto> encontrarReparto(Long repartoId);
    Optional<Reparto> actualizarReparto(Long id, String nuevoNombre, String nuevoRol);
}