
package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.dominio.repositorio.GeneroRepositorio;
import com.example.Nesflis.persistencia.entidad.Genero;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroServicioImpl implements GeneroServicio {

    @Autowired
    private GeneroRepositorio generoRepository;

    @Override
    public Genero saveGenero(Genero genero) {
        return generoRepository.save(genero);
    }

    @Override
    public void delGenero(Long generoId) {
        generoRepository.deleteById(generoId);
    }

    @Override
    public List<Genero> listarGeneros() {
        return generoRepository.findAll();
    }

    @Override
    public Optional<Genero> encontrarGenero(Long generoId) {
        return generoRepository.findById(generoId);
    }
    @Override
    public Optional<Genero> actualizarGenero(Long id, String nuevoNombre) {
        Optional<Genero> generoOpt = generoRepository.findById(id);
        if (generoOpt.isPresent()) {
            Genero genero = generoOpt.get();
            genero.setNombre(nuevoNombre); 
            generoRepository.save(genero); 
            return Optional.of(genero);
        }
        return Optional.empty(); 
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
        
//Actualizar genero
//Long idGenero = 2L; // ID del género a actualizar
//String nuevoNombre = "Drama";
//Optional<Genero> generoActualizado = generoService.actualizarGenero(idGenero, nuevoNombre);
//generoActualizado.ifPresent(g -> System.out.println("Género actualizado: " + g.getNombre()));