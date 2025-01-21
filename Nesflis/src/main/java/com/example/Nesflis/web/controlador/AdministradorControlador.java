package com.example.Nesflis.web.controlador;

import com.example.Nesflis.dominio.repositorio.AdministradorRepositorio;
import com.example.Nesflis.persistencia.entidad.Administrador;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorControlador {
    
    @Autowired
    private AdministradorRepositorio administradorRepository;
    
    public Administrador saveAdmin(Administrador admin) {
        return administradorRepository.save(admin);
    }
    
    public void delAdministrador(Long administradorId){
        administradorRepository.deleteById(administradorId);
    }
    
    public List<Administrador> listarAdmin(){
        return administradorRepository.findAll();
    }
    
    public Optional<Administrador> encontrarAdmin (Long adminId){
        return administradorRepository.findById(adminId);
    }    
    
    public Optional<Administrador> encontrarPorCorreo(String correo) {
        return administradorRepository.findAdministradorByCorreo(correo);
    }
}
