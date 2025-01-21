package com.example.Nesflis.dominio.repositorio;


import com.example.Nesflis.persistencia.entidad.Plan;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PlanRepositorio extends JpaRepository<Plan, Long>{
    List<Plan> findByCalidadVideo(String calidadVideo);    
}