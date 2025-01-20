/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controlador;

import com.example.demo.modelo.entidades.Reparto;
import com.example.demo.modelo.repositorio.RepartoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RepartoServicio {

    @Autowired
    private RepartoRepositorio repartoRepository; 

    // Crear o actualizar un reparto
    public Reparto saveReparto(Reparto reparto) {
        return repartoRepository.save(reparto); 
    }

    // Eliminar un reparto por su ID
    public void delReparto(Long repartoId) {
        repartoRepository.deleteById(repartoId);
    }

    // Listar todos los repartos
    public List<Reparto> listarReparto() {
        return repartoRepository.findAll(); 
    }

    // Encontrar un reparto por su ID
    public Optional<Reparto> encontrarReparto(Long repartoId) {
        return repartoRepository.findById(repartoId); 
    }
}
        // Crear  un nuevo reparto
//        Reparto nuevoReparto = new Reparto();
//        nuevoReparto.setNombre("Juan Pérez");
//        nuevoReparto.setRol("Protagonista");
//        nuevoReparto.setContenidos(contenidos); 
//        repartoService.saveReparto(nuevoReparto);

        // Listar todos los repartos
//        List<Reparto> repartos = repartoService.listarReparto();
//        for (Reparto reparto : repartos) {
//            System.out.println("Reparto: " + reparto.getNombre() + " - Rol: " + reparto.getRol());
//        }

        // Buscar un reparto por ID
//        Optional<Reparto> repartoBuscado = repartoService.encontrarReparto(1L);  // Buscar reparto con ID 1
//        repartoBuscado.ifPresent(r -> System.out.println("Reparto encontrado: " + r.getNombre()));

//         Eliminar un reparto por ID
//        repartoService.delReparto(1L);
//        System.out.println("Reparto eliminado.");
//        