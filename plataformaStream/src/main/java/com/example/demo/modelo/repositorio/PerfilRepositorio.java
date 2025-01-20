<<<<<<< HEAD

package com.example.demo.modelo.repositorio;

import com.example.demo.modelo.entidades.Perfil;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepositorio extends JpaRepository<Perfil, Long>{
//    List<Perfil> findByUsuario_Id(Long idUsuario);
=======
package com.example.demo.modelo.repositorio;

import com.example.demo.modelo.entidades.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepositorio extends JpaRepository<Perfil, Long> {
>>>>>>> 787cf309e2b32b7754e031eb2b10b0b36ee20dbb
}
