package com.example.demo.dominio.repositorio;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.persistencia.entidades.Plan;


@Repository
public interface PlanRepositorio extends JpaRepository<Plan, Long>{
    List<Plan> findByCalidadVideo(String calidadVideo);    
}