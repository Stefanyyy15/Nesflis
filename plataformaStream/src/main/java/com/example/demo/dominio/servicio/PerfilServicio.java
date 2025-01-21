
package com.example.demo.dominio.servicio;

import com.example.demo.persistencia.entidades.Perfil;
import com.example.demo.dominio.repositorio.PerfilRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerfilServicio {

    @Autowired
    private PerfilRepositorio perfilRepository;

    // Crear o actualizar un perfil
    public Perfil savePerfil(Perfil perfil) {
        return perfilRepository.save(perfil); 
    }

    // Eliminar un perfil por su ID
    public void delPerfil(Long perfilId) {
        perfilRepository.deleteById(perfilId); 
    }

    // Listar todos los perfiles
    public List<Perfil> listarPerfil() {
        return perfilRepository.findAll(); // Devuelve todos los perfiles
    }

    // Encontrar un perfil por su ID
    public Optional<Perfil> encontrarPerfil(Long perfilId) {
        return perfilRepository.findById(perfilId); 
    }
}
  //         Crear un nuevo perfil
//Perfil nuevoPerfil = new Perfil();
//nuevoPerfil.setNombre("Perfil de Juan");
//nuevoPerfil.setUsuario(usuario); 
//nuevoPerfil.setContenidoFavorito(contenidoFavorito); 
//
// Guardar el perfil
//perfilService.savePerfil(nuevoPerfil);

// Obtener la lista de todos los perfiles
//List<Perfil> perfiles = perfilService.listarPerfil();
//
//// Mostrar los perfiles
//for (Perfil perfil : perfiles) {
//    System.out.println("Perfil: " + perfil.getNombre());
//}

// Buscar un perfil por su ID
//Optional<Perfil> perfilBuscado = perfilService.encontrarPerfil(1L); 
//perfilBuscado.ifPresent(p -> System.out.println("Perfil encontrado: " + p.getNombre()));

// Eliminar el perfil con el ID 1
//perfilService.delPerfil(1L);
//System.out.println("Perfil eliminado.");