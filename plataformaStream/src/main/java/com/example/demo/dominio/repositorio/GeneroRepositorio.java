
package com.example.demo.dominio.repositorio;

import com.example.demo.persistencia.entidades.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepositorio extends JpaRepository<Genero, Long>{
    
}
