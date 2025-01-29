package com.example.Nesflis.dominio.servicio;
import com.example.Nesflis.persistencia.entidad.Usuario;
import java.util.List;
import java.util.Optional;


public interface UsuarioServicio {
    Usuario saveUsuario(Usuario usuario);
    void deleteUsuario(Long usuarioId);
    List<Usuario> listarUsuarios();
    Optional<Usuario> encontrarUsuario (Long usuarioId);
    Optional<Usuario> encontrarPorCorreo(String correo);
}
