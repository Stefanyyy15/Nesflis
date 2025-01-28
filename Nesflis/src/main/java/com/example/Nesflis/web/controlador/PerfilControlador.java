package com.example.Nesflis.web.controlador;

import com.example.Nesflis.dominio.servicio.PerfilServicioImpl;
import com.example.Nesflis.persistencia.entidad.Contenido;
import com.example.Nesflis.persistencia.entidad.Perfil;
import com.example.Nesflis.web.exception.ContenidoNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/perfil")
public class PerfilControlador {

    private final PerfilServicioImpl perfilService;

    @Autowired
    public PerfilControlador(PerfilServicioImpl perfilService) {
        this.perfilService = perfilService;
    }

    @GetMapping
    public List<Perfil> getAllPerfiles() {
        return perfilService.listarPerfil();
    }

    @GetMapping("/{id}")
    public Optional<Perfil> getPerfilById(@PathVariable Long id) {
        return perfilService.encontrarPerfil(id);
    }

    @PostMapping
    public Perfil createPerfil(@RequestBody Perfil perfil) {
        return perfilService.savePerfil(perfil);
    }

    @DeleteMapping("/{id}")
    public void deletePerfil(@PathVariable Long id) {
        perfilService.delPerfil(id);
    }

    @PutMapping("/{id}")
    public Perfil updatePerfil(@PathVariable Long id, @RequestBody Perfil perfil) {
        Optional<Perfil> perfilExistente = perfilService.encontrarPerfil(id);

        if (perfilExistente.isPresent()) {
            Perfil perfilActualizado = perfilExistente.get();
            perfilActualizado.setNombre(perfil.getNombre());
            if (perfil.getContenidosFavoritos() != null) {
                perfilActualizado.setContenidosFavoritos(perfil.getContenidosFavoritos());
            }
            return perfilService.savePerfil(perfilActualizado);
        } else {
            throw new RuntimeException("Perfil con ID " + id + " no encontrado.");
        }
    }

}
