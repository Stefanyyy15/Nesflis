
package com.example.demo.controlador;

import com.example.demo.modelo.entidades.Role;
import com.example.demo.modelo.repositorio.RoleRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class roleservice {
    @Autowired
    private RoleRepositorio roleRepository;

    public Role saveRole(String name) {
        Role role = new Role(name);
        return roleRepository.save(role);
    }
    public List<Role> getAll() {
        return roleRepository.findAll();
    }
    public Optional<Role> getRoleById(Long id) {
        return roleRepository.findById(id);
    }
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}
