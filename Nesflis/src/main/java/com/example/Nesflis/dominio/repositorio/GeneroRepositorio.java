
package com.example.Nesflis.dominio.repositorio;

import com.example.Nesflis.persistencia.entidad.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepositorio extends JpaRepository<Genero, Long>{
    List<Genero> findByNombre(String nombre);
}
