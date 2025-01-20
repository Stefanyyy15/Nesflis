
package com.example.demo.modelo.repositorio;

import com.example.demo.modelo.entidades.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    
<<<<<<< HEAD
=======
}
>>>>>>> 787cf309e2b32b7754e031eb2b10b0b36ee20dbb
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
<<<<<<< HEAD
}

=======
//}
//
>>>>>>> 787cf309e2b32b7754e031eb2b10b0b36ee20dbb
