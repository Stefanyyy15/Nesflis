package com.example.demo.controlador;

import com.example.demo.modelo.entidades.Serie;
import com.example.demo.modelo.repositorio.SerieRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieServicio {

    @Autowired
    private SerieRepositorio serieRepositorio;

    // Crear o actualizar una serie
    public Serie saveSerie(Serie serie) {
        return serieRepositorio.save(serie);
    }

    // Eliminar una serie por su ID
    public void deleteSerie(Long serieId) {
        serieRepositorio.deleteById(serieId);
    }

    // Listar todas las series
    public List<Serie> listarSeries() {
        return serieRepositorio.findAll();
    }

    // Encontrar una serie por su ID
    public Optional<Serie> encontrarSerie(Long serieId) {
        return serieRepositorio.findById(serieId);
    }
}
