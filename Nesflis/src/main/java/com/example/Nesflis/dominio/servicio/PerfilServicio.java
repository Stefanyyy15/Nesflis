
package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.persistencia.entidad.Perfil;
import java.util.List;
import java.util.Optional;

public interface PerfilServicio {
    Perfil savePerfil(Perfil perfil);
    void delPerfil(Long perfilId);
    List<Perfil> listarPerfil();
    Optional<Perfil> encontrarPerfil(Long perfilId);
}