package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.dominio.repositorio.PlanRepositorio;
import com.example.Nesflis.persistencia.entidad.Plan;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanServicioImpl implements PlanServicio {

    @Autowired
    private PlanRepositorio planRepository;

    // Crear o actualizar un plan
    @Override
    public Plan savePlan(Plan plan) {
        return planRepository.save(plan);
    }

    // Eliminar un plan por su ID
    @Override
    public void delPlan(Long planId) {
        planRepository.deleteById(planId);
    }

    // Listar todos los planes
    @Override
    public List<Plan> listarPlan() {
        return planRepository.findAll();
    }

    // Encontrar un plan por su ID
    @Override
    public Optional<Plan> encontrarPlan(Long planId) {
        return planRepository.findById(planId);
    }

    @Transactional
    @Override
    public Optional<Plan> actualizarPlan(Long idPlan, String nuevoNombre, Double nuevoPrecio_mensual, String nuevoCalidadVideo, int nuevoNumeroPerfil) {
        Optional<Plan> planOpt = planRepository.findById(idPlan);

        if (planOpt.isPresent()) {
            Plan plan = planOpt.get();
            plan.setNombre(nuevoNombre);
            plan.setPrecio_mensual(nuevoPrecio_mensual);
            plan.setCalidad_video(nuevoCalidadVideo);
            plan.setNum_perfiles(nuevoNumeroPerfil);

            planRepository.save(plan); // Guardar cambios
            return Optional.of(plan);
        }

        System.out.println("Plan con ID " + idPlan + " no encontrado.");
        return Optional.empty();
    }

}
//Crear ´plan
//        Plan nuevoPlan = new Plan();
//        nuevoPlan.setNombre("Plan Premium");
//        nuevoPlan.setPrecio_mensual(19.999);
//        nuevoPlan.setCalidad_video("4K");
//        nuevoPlan.setNum_perfiles(5);
//        planService.savePlan(nuevoPlan); 

// Listar todos los planes
//        List<Plan> planes = planService.listarPlan();
//        for (Plan plan : planes) {
//            System.out.println("Plan: " + plan.getNombre());
//        }
// Buscar un plan por ID
//        Optional<Plan> planBuscado = planService.encontrarPlan(1L);  // Buscar plan con ID 1
//        planBuscado.ifPresent(p -> System.out.println("Plan encontrado: " + p.getNombre()));
// Eliminar un plan por ID
//        planService.delPlan(1L);
//        System.out.println("Plan eliminado.");

//Long idPlan = 2L; // ID del reparto a actualizar
//String nuevoNombre = "Melenudo";
//Double nuevoPrecio_mensual = 25.000;
//String nuevoCalidadVideo = "4K";
//int nuevoNumeroPerfil = 2;
//Optional<Plan> planActualizado = planService.actualizarPlan(idPlan, Precio_mensual,  nuevoCalidadVideo, nuevoNumeroPerfil );
//planActualizado.ifPresent(r -> System.out.println("Plan actualizado" ));
//        

