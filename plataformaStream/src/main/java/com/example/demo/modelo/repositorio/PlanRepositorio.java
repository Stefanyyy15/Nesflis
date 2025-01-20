package com.example.demo.modelo.repositorio;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.entidades.Plan;


@Repository
public interface PlanRepositorio extends JpaRepository<Plan, Long>{
    List<Plan> findByCalidadVideo(String calidadVideo);    
}
