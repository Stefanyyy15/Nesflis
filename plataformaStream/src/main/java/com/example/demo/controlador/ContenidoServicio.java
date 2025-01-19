
package com.example.demo.controlador;

import com.example.demo.modelo.entidades.Contenido;
import com.example.demo.modelo.entidades.Genero;
import com.example.demo.modelo.entidades.Reparto;
import com.example.demo.modelo.repositorio.ContenidoRepositorio;
import com.example.demo.modelo.repositorio.GeneroRepositorio;
import com.example.demo.modelo.repositorio.RepartoRepositorio;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContenidoServicio {
     @Autowired
    private ContenidoRepositorio contenidoRepository;

    @Autowired
    private GeneroRepositorio generoRepository;

    @Autowired
    private RepartoRepositorio repartoRepository;

    @Transactional
    public void agregarContenido(Contenido contenido, List<Genero> generos, List<Reparto> reparto) {
        contenido.setGeneros(generos);
        contenido.setActores(reparto);
        generoRepository.saveAll(generos);
        repartoRepository.saveAll(reparto);
        contenidoRepository.save(contenido);
    }

}

