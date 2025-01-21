package com.example.demo.dominio.servicio;

import com.example.demo.persistencia.entidades.Usuario;
import com.example.demo.dominio.repositorio.UsuarioRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
    
    @Autowired
    private UsuarioRepositorio usuarioRepository;
    
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    
    public void deleteUsuario(Long usuarioId){
        usuarioRepository.deleteById(usuarioId);
    }
    
    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }
    
    public Optional<Usuario> encontrarUsuario (Long usuarioId){
        return usuarioRepository.findById(usuarioId);
    }    
    
    public Optional<Usuario> encontrarPorCorreo(String correo) {
        return usuarioRepository.findUsuarioByCorreo(correo);
    }
}
