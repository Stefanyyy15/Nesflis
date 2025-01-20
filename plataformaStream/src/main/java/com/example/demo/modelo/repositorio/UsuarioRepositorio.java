
package com.example.demo.modelo.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.modelo.entidades.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findUsuarioByCorreo(@Param("correo") String correo);


}
    // ********************************************************
    // Consultas JPQL
//    @Query("SELECT u FROM Usuario u JOIN u.perfiles p WHERE p.edad >= 18")
//    List<Usuario> findUsuariosConPerfilesAdultos();
//
//    @Query("SELECT u FROM Usuario u " +
//           "JOIN u.perfiles p " +
//           "GROUP BY u.id_usuario " +
//           "HAVING COUNT(p) > 2")
//    List<Usuario> findUsuariosConMasDe2Perfiles();

//}
//
