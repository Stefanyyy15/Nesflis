
package com.example.demo.modelo.repositorio;

import com.example.demo.modelo.entidades.Perfil;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepositorio extends JpaRepository<Perfil, Long>{
//    List<Perfil> findByUsuario_Id(Long idUsuario);
}
