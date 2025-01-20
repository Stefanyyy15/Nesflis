
package com.example.demo.modelo.repositorio;

import com.example.demo.modelo.entidades.Reparto;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

public interface RepartoRepositorio extends JpaRepository<Reparto, Long>{
     List<Reparto> findByNombreIgnoreCase(String nombre);
    
    
=======
import org.springframework.stereotype.Repository;

@Repository
public interface RepartoRepositorio extends JpaRepository<Reparto, Long> {
>>>>>>> 787cf309e2b32b7754e031eb2b10b0b36ee20dbb
}
