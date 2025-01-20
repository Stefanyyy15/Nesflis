package com.example.demo.modelo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.entidades.Contenido;

@Repository
public interface ContenidoRepositorio extends JpaRepository<Contenido, Long> {

    @Query("SELECT c FROM Contenido c WHERE c.anio_Estreno = :anio")
    List<Contenido> findContenidosByAnioEstreno(@Param("anio") int anio);
}
