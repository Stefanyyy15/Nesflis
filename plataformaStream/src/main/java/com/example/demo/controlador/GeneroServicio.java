package com.example.demo.controlador;

import com.example.demo.modelo.entidades.Genero;
import com.example.demo.modelo.repositorio.GeneroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GeneroServicio {

    @Autowired
    private GeneroRepositorio generoRepository;

    public Genero saveGenero(Genero genero) {
        return generoRepository.save(genero);
    }

    public void delGenero(Long generoId) {
        generoRepository.deleteById(generoId);
    }

    public List<Genero> listarGeneros() {
        return generoRepository.findAll();
    }

    public Optional<Genero> encontrarGenero(Long generoId) {
        return generoRepository.findById(generoId);
    }
}
