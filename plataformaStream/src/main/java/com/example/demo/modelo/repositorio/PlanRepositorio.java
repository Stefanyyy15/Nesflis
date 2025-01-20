
package com.example.demo.modelo.repositorio;

import com.example.demo.modelo.entidades.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepositorio extends JpaRepository<Plan, Long>{
<<<<<<< HEAD
    List<Plan> findByCalidadVideo(String calidadVideo);
=======
>>>>>>> 787cf309e2b32b7754e031eb2b10b0b36ee20dbb
    
}
