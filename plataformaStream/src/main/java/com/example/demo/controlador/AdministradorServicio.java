package com.example.demo.controlador;

import com.example.demo.modelo.entidades.Administrador;
import com.example.demo.modelo.repositorio.AdministradorRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServicio {
    
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
}
//        1. Agregar admin
//       Administrador admin1 = new Administrador();
//       admin1.setNombre("Stefa");
//       admin1.setCorreo("tefa@gmail.com");
//       admin1.setContraseña("minionsXpitufos");
//       adminService.saveAdmin(admin1);

//        2. listar Admin
//         adminService.listarAdmin();

//        3. Encontrar admin x ID
//        Optional<Administrador> ola = adminService.encontrarAdmin(Long.valueOf("1"));
//        System.out.println(ola);

//          4. Eliminar Admin
//          adminService.delAdministrador(Long.valueOf("1"));