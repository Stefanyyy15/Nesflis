/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controlador;


import com.example.demo.modelo.entidades.Plan;
import com.example.demo.modelo.repositorio.PlanRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanServicio {

    @Autowired
    private PlanRepositorio planRepository; 

    // Crear o actualizar un plan
    public Plan savePlan(Plan plan) {
        return planRepository.save(plan);
    }

    // Eliminar un plan por su ID
    public void delPlan(Long planId) {
        planRepository.deleteById(planId); 
    }

    // Listar todos los planes
    public List<Plan> listarPlan() {
        return planRepository.findAll(); 
    }

    // Encontrar un plan por su ID
    public Optional<Plan> encontrarPlan(Long planId) {
        return planRepository.findById(planId); 
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
//        
        