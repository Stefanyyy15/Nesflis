package com.example.demo.modelo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.entidades.Contenido;
import com.example.demo.modelo.entidades.Perfil;

@Repository
public interface PerfilRepositorio extends JpaRepository<Perfil, Long> {
    List<Perfil> findByContenidoFavorito(Contenido contenidoFavorito);
}
