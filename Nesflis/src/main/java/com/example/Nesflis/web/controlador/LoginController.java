
package com.example.Nesflis.web.controlador;

import com.example.Nesflis.dominio.seguridad.JWTAuthtenticationConfig;
import com.example.Nesflis.dominio.servicio.UsuarioServicioImpl;
import com.example.Nesflis.persistencia.entidad.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private JWTAuthtenticationConfig jwtAuthtenticationConfig;

    @Autowired
    private UsuarioServicioImpl imp;

    @PostMapping("/login")
    public ResponseEntity<?> login(
            @RequestParam("correo") String correo,
            @RequestParam("contrasena") String contrasena) {

        if (imp.verificarUsuario(correo, contrasena)) {
            String token = jwtAuthtenticationConfig.getJWTToken(correo);

            User user = new User(correo, contrasena, token);
            return ResponseEntity.ok(user);
        }
        return null;

    }

}


