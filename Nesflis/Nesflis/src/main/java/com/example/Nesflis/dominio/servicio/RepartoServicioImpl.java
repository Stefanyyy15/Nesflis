
package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.dominio.repositorio.RepartoRepositorio;
import com.example.Nesflis.persistencia.entidad.Reparto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepartoServicioImpl implements RepartoServicio {

    @Autowired
    private RepartoRepositorio repartoRepository; 

    // Crear o actualizar un reparto
    @Override
    public Reparto saveReparto(Reparto reparto) {
        return repartoRepository.save(reparto); 
    }

    // Eliminar un reparto por su ID
    @Override
    public void delReparto(Long repartoId) {
        repartoRepository.deleteById(repartoId);
    }

    // Listar todos los repartos
    @Override
    public List<Reparto> listarReparto() {
        return repartoRepository.findAll(); 
    }

    // Encontrar un reparto por su ID
    @Override
    public Optional<Reparto> encontrarReparto(Long repartoId) {
        return repartoRepository.findById(repartoId); 
    }
    
    @Override
     public Optional<Reparto> actualizarReparto(Long id, String nuevoNombre, String nuevoRol) {
        Optional<Reparto> repartoOpt = repartoRepository.findById(id);
        if (repartoOpt.isPresent()) {
            Reparto reparto = repartoOpt.get();
            reparto.setNombre(nuevoNombre); 
            reparto.setRol(nuevoRol); 
            repartoRepository.save(reparto);
            return Optional.of(reparto);
        }
        return Optional.empty();
    }

}
        // Crear  un nuevo reparto
//        Reparto nuevoReparto = new Reparto();
//        nuevoReparto.setNombre("Juan Pérez");
//        nuevoReparto.setRol("Protagonista");
//        nuevoReparto.setContenidos(contenidos); 
//        repartoService.saveReparto(nuevoReparto);

        // Listar todos los repartos
//        List<Reparto> repartos = repartoService.listarReparto();
//        for (Reparto reparto : repartos) {
//            System.out.println("Reparto: " + reparto.getNombre() + " - Rol: " + reparto.getRol());
//        }

        // Buscar un reparto por ID
//        Optional<Reparto> repartoBuscado = repartoService.encontrarReparto(1L);  // Buscar reparto con ID 1
//        repartoBuscado.ifPresent(r -> System.out.println("Reparto encontrado: " + r.getNombre()));

//         Eliminar un reparto por ID
//        repartoService.delReparto(1L);
//        System.out.println("Reparto eliminado.");
//        
//    Actualizar un reparto
//Long idReparto = 2L; // ID del reparto a actualizar
//String nuevoNombre = "Carlos López";
//String nuevoRol = "Secundario";
//Optional<Reparto> repartoActualizado = repartoService.actualizarReparto(idReparto, nuevoNombre, nuevoRol);
//repartoActualizado.ifPresent(r -> System.out.println("Reparto actualizado: " + r.getNombre() + " - Rol: " + r.getRol()));