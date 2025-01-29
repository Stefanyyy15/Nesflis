
package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.dominio.repositorio.UsuarioRepositorio;
import com.example.Nesflis.persistencia.entidad.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{
     
    @Autowired
    private UsuarioRepositorio usuarioRepository;
    
    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    @Override
    public void deleteUsuario(Long usuarioId){
        usuarioRepository.deleteById(usuarioId);
    }
    @Override
    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }
    @Override
    public Optional<Usuario> encontrarUsuario (Long usuarioId){
        return usuarioRepository.findById(usuarioId);
    }    
    @Override
    public Optional<Usuario> encontrarPorCorreo(String correo) {
        return usuarioRepository.findUsuarioByCorreo(correo);
    }
    
    
    public boolean verificarUsuario(String name, String password) {
    Usuario verifi = usuarioRepository.findUsuarioByCorreo(name).get();
    
    if (verifi == null) {
        return false; 
    }

    if (!verifi.getContrasena().equals(password)) {
        return false; 
    }
    
    return true; 
}
}



// Crear un nuevo usuario
// Usuario nuevoUsuario = new Usuario();
// nuevoUsuario.setNombre("Kevin Santacruz");
// nuevoUsuario.setCorreo("PazEnElAriporo@email.com");
// usuarioService.saveUsuario(nuevoUsuario);

// Listar todos los usuarios
// List<Usuario> usuarios = usuarioService.listarUsuarios();
// for (Usuario usuario : usuarios) {
//     System.out.println("Usuario: " + usuario.getNombre() + " - Correo: " + usuario.getCorreo());
// }

// Buscar un usuario por ID
// Optional<Usuario> usuarioBuscado = usuarioService.encontrarUsuario(1L);
// usuarioBuscado.ifPresent(u -> System.out.println("Usuario encontrado: " + u.getNombre()));

// Actualizar un usuario
// Long idUsuario = 2L;
// String nuevoNombre = "Carlos López";
// String nuevoCorreo = "carloslopez@email.com";
// Optional<Usuario> usuarioActualizado = usuarioService.actualizarUsuario(idUsuario, nuevoNombre, nuevoCorreo);
// usuarioActualizado.ifPresent(u -> System.out.println("Usuario actualizado: " + u.getNombre() + " - Correo: " + u.getCorreo()));

// Eliminar un usuario por ID
// usuarioService.deleteUsuario(1L);
// System.out.println("Usuario eliminado.");
