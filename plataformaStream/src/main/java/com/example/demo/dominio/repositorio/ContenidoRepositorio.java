package com.example.demo.dominio.repositorio;

import com.example.demo.persistencia.entidades.Contenido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ContenidoRepositorio extends JpaRepository<Contenido, Long> {

    @Query("SELECT c FROM Contenido c WHERE c.anio_Estreno = :anio")
    List<Contenido> findContenidosByAnioEstreno(@Param("anio") int anio);
}
