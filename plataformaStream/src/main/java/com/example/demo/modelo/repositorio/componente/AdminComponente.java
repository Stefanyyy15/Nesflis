
package com.example.demo.modelo.repositorio.componente;

import com.example.demo.modelo.entidades.Administrador;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class AdminComponente {

    private static final List<Administrador> administradores = new ArrayList<>();

    static {
        administradores.add(new Administrador("Luis", "lui@nesflis.com", "hombreInfiel12"));
        administradores.add(new Administrador("Michelle", "michelle@nesflis.com", "bonita123"));
        administradores.add(new Administrador("Stefany", "stefa@nesflis.com", "soyLaMejor123"));
    }

    public List<Administrador> getAdministradores() {
        return administradores;
    }
}

