package com.example.Nesflis.web.controlador;

import com.example.Nesflis.dominio.servicio.UsuarioServicioImpl;
import com.example.Nesflis.persistencia.entidad.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioControlador {

    private final UsuarioServicioImpl usuarioImpl;

    @Autowired
    public UsuarioControlador(UsuarioServicioImpl usuarioImpl) {
        this.usuarioImpl = usuarioImpl;
    }

    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioImpl.listarUsuarios();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> getUsuarioById(@PathVariable Long id) {
        return usuarioImpl.encontrarUsuario(id);
    }

    @GetMapping("/correo/{correo}")
    public Optional<Usuario> getUsuarioByCorreo(@PathVariable String correo) {
        return usuarioImpl.encontrarPorCorreo(correo);
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioImpl.saveUsuario(usuario);
    }
    
    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        usuarioImpl.deleteUsuario(id);
    }
}
