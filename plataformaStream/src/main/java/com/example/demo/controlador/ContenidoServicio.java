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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ContenidoServicio {

    private final ContenidoRepositorio contenidoRepository;
    private GeneroRepositorio generoRepository;
    private RepartoRepositorio repartoRepository;

    @Autowired
    private AdministradorRepositorio adminRepository;

    public ContenidoServicio(ContenidoRepositorio contenidoRepository, RepartoRepositorio repartoReposiroty, GeneroRepositorio generoRepoditory) {
        this.contenidoRepository = contenidoRepository;
        this.generoRepository = generoRepoditory;
        this.repartoRepository = repartoReposiroty;
    }

    public Contenido saveContenido(Contenido contenido) {
        try {
            return contenidoRepository.save(contenido);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Error al guardar el contenido: " + e.getMessage(), e);
        }
    }

    @Transactional
    public void agregarContenido(Contenido contenido, List<Genero> generos, List<Reparto> reparto) {
        try {
            contenido.setGeneros(generos);
            contenido.setActores(reparto);
            generoRepository.saveAll(generos);
            repartoRepository.saveAll(reparto);
            contenidoRepository.save(contenido);
            System.out.println("Contenido agregado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al agregar contenido: ");
        }
    }

    @Transactional
    public void eliminarContenido(Long contenidoId) {
        Optional<Contenido> contenidoOptional = contenidoRepository.findById(contenidoId);

        if (contenidoOptional.isPresent()) {
            contenidoRepository.deleteById(contenidoId);
            System.out.println("Contenido eliminado correctamente.");
        } else {
            System.out.println("Contenido con ID " + contenidoId + " no encontrado.");
        }
    }

    @Transactional
    public List<Genero> obtenerGenerosDeUnContenido(Long contenidoId) {
        Optional<Contenido> optionalContenido = contenidoRepository.findById(contenidoId);

        return optionalContenido.map(Contenido::getGeneros).orElse(Collections.emptyList());
    }

    @Transactional
    public void actualizarAdministradorContenido(Long contenidoId, Administrador administrador) {
        try {
            final Administrador administradorPersistido = adminRepository.save(administrador);

            Optional<Contenido> optionalContenido = contenidoRepository.findById(contenidoId);
            if (optionalContenido.isPresent()) {
                Contenido contenido = optionalContenido.get();
                contenido.setAdministrador(administradorPersistido);
                contenidoRepository.save(contenido);
            } else {
                System.out.println("Contenido con ID " + contenidoId + " no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar el administrador del contenido: " + e);
        }
    }
    
    public List<Contenido> obtenerContenidosPorAnio(int anio) {
        return contenidoRepository.findContenidosByAnioEstreno(anio);
    }
}


