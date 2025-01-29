package com.example.Nesflis.web.controlador;

import com.example.Nesflis.dominio.servicio.GeneroServicioImpl;
import com.example.Nesflis.persistencia.entidad.Genero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/genero")
public class GeneroControlador {

    private final GeneroServicioImpl generoServicio;

    @Autowired
    public GeneroControlador(GeneroServicioImpl generoServicio) {
        this.generoServicio = generoServicio;
    }

    @GetMapping
    public List<Genero> getAllGeneros() {
        return generoServicio.listarGeneros();
    }

    @GetMapping("/{id}")
    public Optional<Genero> getGeneroById(@PathVariable Long id) {
        return generoServicio.encontrarGenero(id);
    }

    @PostMapping
    public Genero createGenero(@RequestBody Genero genero) {
        return generoServicio.saveGenero(genero);
    }

    @DeleteMapping("/{id}")
    public void deleteGenero(@PathVariable Long id) {
        generoServicio.delGenero(id);
    }

    @PutMapping("/{id}")
    public Genero updateGenero(@PathVariable Long id, @RequestBody Genero genero) {
        Optional<Genero> generoExistente = generoServicio.encontrarGenero(id);
        if (generoExistente.isPresent()) {
            Genero generoActualizado = generoExistente.get();
            generoActualizado.setNombre(genero.getNombre());
            return generoServicio.saveGenero(generoActualizado);
        } else {
            throw new RuntimeException("Género con ID " + id + " no encontrado.");
        }
    }
}
