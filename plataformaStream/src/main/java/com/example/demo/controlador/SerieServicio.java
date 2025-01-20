package com.example.demo.controlador;

import com.example.demo.modelo.entidades.Serie;
import com.example.demo.modelo.repositorio.SerieRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerieServicio {
    
    @Autowired
    private SerieRepositorio serieRepository;
    
    public Serie saveSerie(Serie serie) {
        return serieRepository.save(serie);
    }
    
    public void deleteSerie(Long serieId){
        serieRepository.deleteById(serieId);
    }
    
    public List<Serie> listarSeries(){
        return serieRepository.findAll();
    }
    
    public Optional<Serie> encontrarSerie(Long serieId){
        return serieRepository.findById(serieId);
    }    
}
