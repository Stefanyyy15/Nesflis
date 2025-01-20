package com.example.demo.controlador;

import com.example.demo.modelo.entidades.Role;
import com.example.demo.modelo.repositorio.RoleRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServicio {

    @Autowired
    private RoleRepositorio roleRepository;

    // Crear o actualizar un role
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    // Eliminar un role por su ID
    public void delRole(Long roleId) {
        roleRepository.deleteById(roleId);
    }

    // Listar todos los roles
    public List<Role> listarRoles() {
        return roleRepository.findAll();
    }

    // Encontrar un role por su ID
    public Optional<Role> encontrarRole(Long roleId) {
        return roleRepository.findById(roleId); 
    }
}
    // Crear un nuevo rol
//        Role nuevoRole = new Role();
//        nuevoRole.setRole("Jankis Potaxie");

//         Guardar el rol
//        roleService.saveRole(nuevoRole);

        // Listar todos los roles
//        List<Role> roles = roleService.listarRoles();
//        for (Role role : roles) {
//            System.out.println("Role: " + role.getRole());
//        }

        // Buscar un role por ID
//        Optional<Role> roleBuscado = roleService.encontrarRole(1L);  
//        roleBuscado.ifPresent(r -> System.out.println("Role encontrado: " + r.getRole()));

        // Eliminar un role por ID
//        roleService.delRole(1L);
//        System.out.println("Role eliminado.");
      