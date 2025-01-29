
package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.dominio.repositorio.ValoracionRepositorio;
import com.example.Nesflis.persistencia.entidad.Valoracion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValoracionServicioImpl implements ValoracionServicio{
   
    @Autowired
    private ValoracionRepositorio valoracionRepository;
    
    @Override
    public Valoracion saveValoracion(Valoracion valoracion) {
        return valoracionRepository.save(valoracion);
    }
    @Override
    public void deleteValoracion(Long valoracionId){
        valoracionRepository.deleteById(valoracionId);
    }
    @Override
    public List<Valoracion> listarValoraciones(){
        return valoracionRepository.findAll();
    }
    @Override
    public Optional<Valoracion> encontrarValoracion(Long valoracionId){
        return valoracionRepository.findById(valoracionId);
    }    
    @Override
    public List<Valoracion> encontrarPorTituloContenido(String tituloContenido) {
        return valoracionRepository.findByContenido_Titulo(tituloContenido);
    }
}


// Crear una nueva valoración
// Valoracion nuevaValoracion = new Valoracion();
// nuevaValoracion.setPuntuacion(5);
// nuevaValoracion.setComentario("Excelente película");
// nuevaValoracion.setContenido(contenido); // Asociar con contenido existente
// valoracionService.saveValoracion(nuevaValoracion);

// Listar todas las valoraciones
// List<Valoracion> valoraciones = valoracionService.listarValoraciones();
// for (Valoracion valoracion : valoraciones) {
//     System.out.println("Valoración: " + valoracion.getPuntuacion() + " - Comentario: " + valoracion.getComentario());
// }

// Buscar una valoración por ID
// Optional<Valoracion> valoracionBuscada = valoracionService.encontrarValoracion(1L);
// valoracionBuscada.ifPresent(v -> System.out.println("Valoración encontrada: " + v.getPuntuacion()));

// Actualizar una valoración
// Long idValoracion = 2L;
// int nuevaPuntuacion = 4;
// String nuevoComentario = "Buena película, pero el final no me convenció.";
// Optional<Valoracion> valoracionActualizada = valoracionService.actualizarValoracion(idValoracion, nuevaPuntuacion, nuevoComentario);
// valoracionActualizada.ifPresent(v -> System.out.println("Valoración actualizada: " + v.getPuntuacion() + " - Comentario: " + v.getComentario()));

// Eliminar una valoración por ID
// valoracionService.deleteValoracion(1L);
// System.out.println("Valoración eliminada.");

