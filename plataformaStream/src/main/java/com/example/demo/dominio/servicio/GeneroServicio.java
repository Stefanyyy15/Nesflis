package com.example.demo.dominio.servicio;

import com.example.demo.persistencia.entidades.Genero;
import com.example.demo.dominio.repositorio.GeneroRepositorio;
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

//        1. Agregar Genero
//         Genero gen8 = new Genero();
//       gen8.setNombre("Romance");
//       generoService.saveGenero(gen8);

//        2. Listar Generos
//         generoService.listarGeneros();
//        
//          3. Encontrar servicio x ID
//        Optional<Genero> generoEncontrado = generoService.encontrarGenero(Long.valueOf("2"));
//        generoEncontrado.ifPresent(g -> System.out.println("Género encontrado: " + g.getNombre()));

//            4. Eliminar Genero
//          generoService.delGenero(Long.valueOf("3"));
        