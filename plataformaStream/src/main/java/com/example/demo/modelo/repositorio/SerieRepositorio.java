package com.example.demo.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.entidades.Serie;

@Repository
public interface SerieRepositorio extends JpaRepository<Serie, Long> {
}
