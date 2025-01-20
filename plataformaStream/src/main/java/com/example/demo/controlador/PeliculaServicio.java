/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controlador;


import com.example.demo.modelo.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

import com.example.demo.modelo.entidades.Pelicula;

@Service
public class PeliculaServicio {

    @Autowired
    private PeliculaRepositorio peliculaRepository;

    // Guardar una nueva película
    public Pelicula savePelicula(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    // Eliminar una película por ID
    public void delPelicula(Long peliculaId) {
        peliculaRepository.deleteById(peliculaId);
    }

    // Listar todas las películas
    public List<Pelicula> listarPelicula() {
        return peliculaRepository.findAll();
    }

    // Encontrar una película por ID
    public Optional<Pelicula> encontrarPelicula(Long peliculaId) {
        return peliculaRepository.findById(peliculaId);
    }

}
    //        Pelicula nuevaPelicula = new Pelicula();
//        nuevaPelicula.setTitulo("El Señor de los Anillos");
//        nuevaPelicula.setDescripcion("Película épica de fantasía.");
//        nuevaPelicula.setAnio_Estreno(2001);
//        nuevaPelicula.setClasificacion("+13");
//        nuevaPelicula.setDuracion(180);
//        peliculaService.savePelicula(nuevaPelicula);
//
// Listar todas las películas
//        List<Pelicula> peliculas = peliculaService.listarPelicula();
//        for (Pelicula pelicula : peliculas) {
//            System.out.println("Película: " + pelicula.getTitulo());
//        }
//
//         Buscar una película por ID
//        Optional<Pelicula> peliculaBuscada = peliculaService.encontrarPelicula(1L);
//        peliculaBuscada.ifPresent(p -> System.out.println("Película encontrada: " + p.getTitulo()));
//
//         Eliminar una película por ID       
//        peliculaService.delPelicula(2L);
//        System.out.println("Película eliminada.");