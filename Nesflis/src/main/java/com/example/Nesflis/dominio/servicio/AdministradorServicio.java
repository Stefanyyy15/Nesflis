
package com.example.Nesflis.dominio.servicio;

import com.example.Nesflis.persistencia.entidad.Administrador;
import java.util.List;

public interface AdministradorServicio {
    List<Administrador> listarAdmin();
    Administrador encontrarAdmin(Long adminId);
    Administrador saveAdmin(Administrador admin);
    Administrador updateAvocado(Administrador aguacate);
    void delAdministrador(Long adminId);
}
