package com.example.Nesflis.web.controlador;

import com.example.Nesflis.dominio.servicio.PlanServicioImpl;
import com.example.Nesflis.persistencia.entidad.Plan;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/plan")
public class PlanControlador {

    private final PlanServicioImpl planImpl;

    @Autowired
    public PlanControlador(PlanServicioImpl planImpl) {
        this.planImpl = planImpl;
    }

    @GetMapping
    public List<Plan> getAllPlans() {
        return planImpl.listarPlan();
    }

    @GetMapping("/{id}")
    public Optional<Plan> getPlanById(@PathVariable Long id) {
        return planImpl.encontrarPlan(id);
    }

    @PostMapping
    public Plan createPlan(@RequestBody Plan plan) {
        return planImpl.savePlan(plan);
    }

    @DeleteMapping("/{id}")
    public void deletePlan(@PathVariable Long id) {
        planImpl.delPlan(id);
    }

    @PutMapping("/{id}")
    public Optional<Plan> updatePlan(@PathVariable Long id, @RequestBody Plan plan) {
        return planImpl.actualizarPlan(id, plan.getNombre(), plan.getPrecio_mensual(), plan.getCalidad_video(), plan.getNum_perfiles());
    }
}
