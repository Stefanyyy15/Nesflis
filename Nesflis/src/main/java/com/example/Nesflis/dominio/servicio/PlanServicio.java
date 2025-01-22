
package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.persistencia.entidad.Plan;
import java.util.List;
import java.util.Optional;

public interface PlanServicio {
    Plan savePlan(Plan plan);
    void delPlan(Long planId);
    List<Plan> listarPlan();
    Optional<Plan> encontrarPlan(Long planId);
    Optional<Plan> actualizarPlan(Long idPlan, String nuevoNombre, Double nuevoPrecio_mensual, String nuevoCalidadVideo, int nuevoNumeroPerfil);
}
