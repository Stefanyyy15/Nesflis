
package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.dominio.repositorio.ValoracionRepositorio;
import com.example.Nesflis.persistencia.entidad.Valoracion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValoracionServicioImpl implements ValoracionServicio{
   
    @Autowired
    private ValoracionRepositorio valoracionRepository;
    
    @Override
    public Valoracion saveValoracion(Valoracion valoracion) {
        return valoracionRepository.save(valoracion);
    }
    @Override
    public void deleteValoracion(Long valoracionId){
        valoracionRepository.deleteById(valoracionId);
    }
    @Override
    public List<Valoracion> listarValoraciones(){
        return valoracionRepository.findAll();
    }
    @Override
    public Optional<Valoracion> encontrarValoracion(Long valoracionId){
        return valoracionRepository.findById(valoracionId);
    }    
    @Override
    public List<Valoracion> encontrarPorTituloContenido(String tituloContenido) {
        return valoracionRepository.findByContenido_Titulo(tituloContenido);
    }
}
