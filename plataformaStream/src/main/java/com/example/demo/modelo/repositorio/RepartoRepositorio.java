
package com.example.demo.modelo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.entidades.Reparto;

@Repository
public interface RepartoRepositorio extends JpaRepository<Reparto, Long>{
     List<Reparto> findByNombreIgnoreCase(String nombre);
}