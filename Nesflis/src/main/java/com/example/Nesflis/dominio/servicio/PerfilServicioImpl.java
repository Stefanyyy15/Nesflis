
package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.dominio.repositorio.PerfilRepositorio;
import com.example.Nesflis.persistencia.entidad.Perfil;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilServicioImpl implements PerfilServicio{

    @Autowired
    private PerfilRepositorio perfilRepository;

    // Crear o actualizar un perfil
    @Override
    public Perfil savePerfil(Perfil perfil) {
        return perfilRepository.save(perfil); 
    }

    // Eliminar un perfil por su ID
    @Override
    public void delPerfil(Long perfilId) {
        perfilRepository.deleteById(perfilId); 
    }

    // Listar todos los perfiles
    @Override
    public List<Perfil> listarPerfil() {
        return perfilRepository.findAll(); // Devuelve todos los perfiles
    }

    // Encontrar un perfil por su ID
    @Override
    public Optional<Perfil> encontrarPerfil(Long perfilId) {
        return perfilRepository.findById(perfilId); 
    }
    
}
<<<<<<< HEAD
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
=======
// Crear un nuevo perfil
// Perfil nuevoPerfil = new Perfil();
// nuevoPerfil.setNombre("Perfil de Juan");
// nuevoPerfil.setUsuario(usuario); 
// nuevoPerfil.setContenidoFavorito(contenidoFavorito);
// perfilService.savePerfil(nuevoPerfil);

// Obtener la lista de todos los perfiles
// List<Perfil> perfiles = perfilService.listarPerfil();
// for (Perfil perfil : perfiles) {
//     System.out.println("Perfil: " + perfil.getNombre());
// }

// Buscar un perfil por su ID
// Optional<Perfil> perfilBuscado = perfilService.encontrarPerfil(1L);
// perfilBuscado.ifPresent(p -> System.out.println("Perfil encontrado: " + p.getNombre()));

// Actualizar un perfil
// Long idPerfil = 2L; // ID del perfil a actualizar
// String nuevoNombre = "Perfil actualizado";
// Optional<Perfil> perfilActualizado = perfilService.actualizarPerfil(idPerfil, nuevoNombre);
// perfilActualizado.ifPresent(p -> System.out.println("Perfil actualizado: " + p.getNombre()));

// Eliminar un perfil por su ID
// perfilService.delPerfil(1L);
// System.out.println("Perfil eliminado.");
>>>>>>> ed09f82 (Actualizando archivos)
