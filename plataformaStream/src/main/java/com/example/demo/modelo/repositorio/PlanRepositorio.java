
package com.example.demo.modelo.repositorio;

import com.example.demo.modelo.entidades.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepositorio extends JpaRepository<Plan, Long>{
    
}
