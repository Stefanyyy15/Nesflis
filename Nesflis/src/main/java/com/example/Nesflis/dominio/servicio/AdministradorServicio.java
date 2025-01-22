
package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.persistencia.entidad.Administrador;
import java.util.List;
import java.util.Optional;

public interface AdministradorServicio {
    List<Administrador> listarAdmin();
    Administrador saveAdmin(Administrador admin);
    Administrador updateAvocado(Administrador admin);
    void delAdministrador(Long adminId);
    Optional<Administrador> encontrarAdmin (Long adminId);
}
