
package com.example.Nesflis.dominio.repositorio;

import com.example.Nesflis.persistencia.entidad.Usuario;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findUsuarioByCorreo(@Param("correo") String correo);


}
