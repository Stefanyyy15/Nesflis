
package com.example.demo.modelo.repositorio;

import com.example.demo.modelo.entidades.Reparto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepartoRepositorio extends JpaRepository<Reparto, Long> {
}
