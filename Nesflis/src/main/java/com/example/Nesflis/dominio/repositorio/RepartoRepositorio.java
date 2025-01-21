
package com.example.Nesflis.dominio.repositorio;

import com.example.Nesflis.persistencia.entidad.Reparto;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepartoRepositorio extends JpaRepository<Reparto, Long>{
     List<Reparto> findByNombreIgnoreCase(String nombre);
}