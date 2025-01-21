
package com.example.demo.dominio.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.persistencia.entidades.Reparto;

@Repository
public interface RepartoRepositorio extends JpaRepository<Reparto, Long>{
     List<Reparto> findByNombreIgnoreCase(String nombre);
}