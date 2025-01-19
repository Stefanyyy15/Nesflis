
package com.example.demo.controlador;

import com.example.demo.modelo.entidades.Administrador;
import com.example.demo.modelo.entidades.Contenido;
import com.example.demo.modelo.entidades.Genero;
import com.example.demo.modelo.entidades.Reparto;
import com.example.demo.modelo.repositorio.AdministradorRepositorio;
import com.example.demo.modelo.repositorio.ContenidoRepositorio;
import com.example.demo.modelo.repositorio.GeneroRepositorio;
import com.example.demo.modelo.repositorio.RepartoRepositorio;
import jakarta.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContenidoServicio {
    
    private final ContenidoRepositorio contenidoRepository;
    private GeneroRepositorio generoRepository;
    private RepartoRepositorio repartoRepository;
    
    @Autowired
    private AdministradorRepositorio adminRepository;
    
    public ContenidoServicio(ContenidoRepositorio contenidoRepository, RepartoRepositorio repartoReposiroty, GeneroRepositorio generoRepoditory){
        this.contenidoRepository = contenidoRepository;
        this.generoRepository = generoRepoditory;
        this.repartoRepository = repartoReposiroty;
    }

    public Contenido saveContenido(Contenido contenido){
        return contenidoRepository.save(contenido);
    }

    @Transactional
    public void agregarContenido(Contenido contenido, List<Genero> generos, List<Reparto> reparto) {
        contenido.setGeneros(generos);
        contenido.setActores(reparto);
        generoRepository.saveAll(generos);
        repartoRepository.saveAll(reparto);
        contenidoRepository.save(contenido);
    }
    
    @Transactional
    public void eliminarContenido(Long contenidoId){
        contenidoRepository.deleteById(contenidoId);
    }
    

    @Transactional
    public List<Genero> obtenerGenerosDeUnContenido(Long contenidoId) {
        Optional<Contenido> optionalContenido = contenidoRepository.findById(contenidoId);

        return optionalContenido.map(Contenido::getGeneros).orElse(Collections.emptyList());
    }


    @Transactional
    public void actualizarAdministradorContenido(Long contenidoId, Administrador administrador) {
        final Administrador administradorPersistido = adminRepository.save(administrador);

        Optional<Contenido> optionalContenido = contenidoRepository.findById(contenidoId);

        optionalContenido.ifPresent(contenido -> {
            contenido.setAdministrador(administradorPersistido);
            contenidoRepository.save(contenido);
        });
    }

}

