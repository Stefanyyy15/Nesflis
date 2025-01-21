
package com.example.Nesflis.dominio.repositorio;

import com.example.Nesflis.persistencia.entidad.Valoracion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValoracionRepositorio extends JpaRepository<Valoracion, Long>{
    List<Valoracion> findByContenido_Titulo(String tituloContenido);
}