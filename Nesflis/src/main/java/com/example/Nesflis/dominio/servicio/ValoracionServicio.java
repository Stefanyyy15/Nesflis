package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.dominio.repositorio.ValoracionRepositorio;
import com.example.Nesflis.persistencia.entidad.Valoracion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ValoracionServicio {
    
    @Autowired
    private ValoracionRepositorio valoracionRepository;
    
    public Valoracion saveValoracion(Valoracion valoracion) {
        return valoracionRepository.save(valoracion);
    }
    
    public void deleteValoracion(Long valoracionId){
        valoracionRepository.deleteById(valoracionId);
    }
    
    public List<Valoracion> listarValoraciones(){
        return valoracionRepository.findAll();
    }
    
    public Optional<Valoracion> encontrarValoracion(Long valoracionId){
        return valoracionRepository.findById(valoracionId);
    }    
    
    public List<Valoracion> encontrarPorTituloContenido(String tituloContenido) {
        return valoracionRepository.findByContenido_Titulo(tituloContenido);
    }
}