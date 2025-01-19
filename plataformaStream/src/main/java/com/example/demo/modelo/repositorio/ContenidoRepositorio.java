
package com.example.demo.modelo.repositorio;

import com.example.demo.modelo.entidades.Contenido;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContenidoRepositorio extends JpaRepository<Contenido, Long>{  
    List<Contenido> findByGeneros_Nombre(String nombreGenero);
    
}
