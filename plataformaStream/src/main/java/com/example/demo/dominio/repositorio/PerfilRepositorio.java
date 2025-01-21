package com.example.demo.dominio.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.persistencia.entidades.Contenido;
import com.example.demo.persistencia.entidades.Perfil;

@Repository
public interface PerfilRepositorio extends JpaRepository<Perfil, Long> {
    List<Perfil> findByContenidoFavorito(Contenido contenidoFavorito);
}