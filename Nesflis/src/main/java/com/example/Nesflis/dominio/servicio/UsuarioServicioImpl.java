
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
}

