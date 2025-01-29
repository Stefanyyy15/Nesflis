package com.example.Nesflis.dominio.repositorio;

import com.example.Nesflis.persistencia.entidad.Contenido;
import com.example.Nesflis.persistencia.entidad.Perfil;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PerfilRepositorio extends JpaRepository<Perfil, Long> {
     List<Perfil> findByContenidosFavoritos(Contenido contenidoFavorito);
}