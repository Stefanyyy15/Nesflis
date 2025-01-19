package com.example.demo.controlador;

import com.example.demo.modelo.entidades.Administrador;
import com.example.demo.modelo.repositorio.AdministradorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServicio {
    
    @Autowired
    private AdministradorRepositorio administradorRepository;
    
    public Administrador saveContenido(Administrador admin) {
        return administradorRepository.save(admin);
    }
    
    public void delAdministrador(Long administradorId){
        administradorRepository.deleteById(administradorId);
    }
    
}
