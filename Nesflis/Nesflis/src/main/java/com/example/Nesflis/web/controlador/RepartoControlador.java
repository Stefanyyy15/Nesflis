package com.example.Nesflis.web.controlador;

import com.example.Nesflis.dominio.servicio.RepartoServicioImpl;
import com.example.Nesflis.persistencia.entidad.Reparto;
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
@RequestMapping("/api/reparto")
public class RepartoControlador {

    private final RepartoServicioImpl repartoImpl;

    @Autowired
    public RepartoControlador(RepartoServicioImpl repartoImpl) {
        this.repartoImpl = repartoImpl;
    }

    @GetMapping
    public List<Reparto> getAllRepartos() {
        return repartoImpl.listarReparto();
    }
    
    @GetMapping("/{id}")
    public Optional<Reparto> getRepartoById(@PathVariable Long id) {
        return repartoImpl.encontrarReparto(id);
    }

    @PostMapping
    public Reparto createReparto(@RequestBody Reparto reparto) {
        return repartoImpl.saveReparto(reparto);
    }

    @DeleteMapping("/{id}")
    public void deleteReparto(@PathVariable Long id) {
        repartoImpl.delReparto(id);
    }

    @PutMapping("/{id}")
    public Optional<Reparto> updateReparto(@PathVariable Long id, @RequestBody Reparto reparto) {
        return repartoImpl.actualizarReparto(id, reparto.getNombre(), reparto.getRol());
    }
}
