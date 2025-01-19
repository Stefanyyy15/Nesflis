
package com.example.demo.modelo.repositorio;

import com.example.demo.modelo.entidades.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorRepositorio extends JpaRepository<Administrador, Long>{
    
}
