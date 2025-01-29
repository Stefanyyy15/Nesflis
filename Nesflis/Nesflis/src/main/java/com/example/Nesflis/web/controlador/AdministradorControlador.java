package com.example.Nesflis.web.controlador;

import com.example.Nesflis.dominio.servicio.AdministradorServicioImpl;
import com.example.Nesflis.persistencia.entidad.Administrador;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/administrador")
public class AdministradorControlador {

    private final AdministradorServicioImpl adminImpl;

    @Autowired
    public AdministradorControlador(AdministradorServicioImpl adminImpl) {
        this.adminImpl = adminImpl;
    }

    @GetMapping
    public List<Administrador> getAllAdministradors() {
        return adminImpl.listarAdmin();
    }

    @GetMapping("/{id}")
    public Optional getAdministradorById(@PathVariable Long id) {
        return adminImpl.encontrarAdmin(id);
    }

    @PostMapping
    public Administrador creatAdministrador(@RequestBody Administrador admin) {
        return adminImpl.saveAdmin(admin);
    }

    @DeleteMapping
    public void deleteAdministrador(@PathVariable Long id) {
        adminImpl.delAdministrador(id);
    }

    @PutMapping("/{id}")
    public Administrador updateAdministrador(@PathVariable Long id, @RequestBody Administrador admin) {
        Optional<Administrador> adminExistente = adminImpl.encontrarAdmin(id);
        if (adminExistente.isPresent()) {
            Administrador adminActualizado = adminExistente.get();
            adminActualizado.setNombre(admin.getNombre());
            adminActualizado.setCorreo(admin.getCorreo());
            adminActualizado.setContraseña(admin.getContraseña());
            return adminImpl.saveAdmin(adminActualizado);
        } else {
            throw new RuntimeException("Administrador con ID " + id + " no encontrado.");

        }
    }
}
