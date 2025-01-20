package com.example.demo.modelo.servicio;

import com.example.demo.modelo.entidades.Serie;
import com.example.demo.modelo.repositorio.SerieRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieServicio {

    private final SerieRepositorio serieRepositorio;

    @Autowired
    public SerieServicio(SerieRepositorio serieRepositorio) {
        this.serieRepositorio = serieRepositorio;
    }

    public Serie guardarSerie(Serie serie) {
        return serieRepositorio.save(serie);
    }

    public List<Serie> obtenerSeries() {
        return serieRepositorio.findAll();
    }

    public Optional<Serie> obtenerSeriePorId(Long id) {
        return serieRepositorio.findById(id);
    }

    public void eliminarSerie(Long id) {
        serieRepositorio.deleteById(id);
    }
}
