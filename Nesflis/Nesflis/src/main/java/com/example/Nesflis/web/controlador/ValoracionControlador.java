package com.example.Nesflis.web.controlador;

import com.example.Nesflis.dominio.servicio.ValoracionServicioImpl;
import com.example.Nesflis.persistencia.entidad.Valoracion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/valoracion")
public class ValoracionControlador {

    private final ValoracionServicioImpl valoracionImpl;

    @Autowired
    public ValoracionControlador(ValoracionServicioImpl valoracionImpl) {
        this.valoracionImpl = valoracionImpl;
    }

    @GetMapping
    public List<Valoracion> getAllValoraciones() {
        return valoracionImpl.listarValoraciones();
    }

    @GetMapping("/{id}")
    public Optional<Valoracion> getValoracionById(@PathVariable Long id) {
        return valoracionImpl.encontrarValoracion(id);
    }

    @GetMapping("/contenido/{titulo}")
    public List<Valoracion> getValoracionesByTituloContenido(@PathVariable String titulo) {
        return valoracionImpl.encontrarPorTituloContenido(titulo);
    }

    @PostMapping
    public Valoracion createValoracion(@RequestBody Valoracion valoracion) {
        return valoracionImpl.saveValoracion(valoracion);
    }

    @DeleteMapping("/{id}")
    public void deleteValoracion(@PathVariable Long id) {
        valoracionImpl.deleteValoracion(id);
    }
}
