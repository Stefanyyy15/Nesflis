package com.example.Nesflis.dominio.repositorio;

import com.example.Nesflis.persistencia.entidad.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface AdministradorRepositorio extends JpaRepository<Administrador, Long> {

    @Query("SELECT a FROM Administrador a WHERE a.correo = :correo")
    Optional<Administrador> findAdministradorByCorreo(@Param("correo") String correo);

}
