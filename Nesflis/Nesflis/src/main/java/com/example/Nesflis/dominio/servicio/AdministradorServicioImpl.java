package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.dominio.repositorio.AdministradorRepositorio;
import com.example.Nesflis.persistencia.entidad.Administrador;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServicioImpl implements AdministradorServicio {
    
    @Autowired
    private AdministradorRepositorio administradorRepository;
    
    @Override
    public Administrador saveAdmin(Administrador admin) {
        return administradorRepository.save(admin);
    }
    
    @Override
    public void delAdministrador(Long administradorId){
        administradorRepository.deleteById(administradorId);
    }
    
    @Override
    public List<Administrador> listarAdmin(){
        return administradorRepository.findAll();
    }
    
    @Override
    public Optional<Administrador> encontrarAdmin (Long adminId){
        return administradorRepository.findById(adminId);
    }    
    
    public Optional<Administrador> encontrarPorCorreo(String correo) {
        return administradorRepository.findAdministradorByCorreo(correo);
    }

    @Override
    public Administrador updateAvocado(Administrador aguacate) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

//        5. Encontrar Administrador x Correo JPQL
//        Optional<Administrador> idk = adminService.encontrarPorCorreo("juankisPotaxie@gmail.com");
//        idk.ifPresent(a -> System.out.println("Administrador Encontrado: " + a.getNombre() + a.getContraseña()));