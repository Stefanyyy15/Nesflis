
package com.example.demo.dominio.repositorio;

import com.example.demo.persistencia.entidades.Valoracion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValoracionRepositorio extends JpaRepository<Valoracion, Long>{
    List<Valoracion> findByContenido_Titulo(String tituloContenido);
}