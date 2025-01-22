package com.example.Nesflis;

import com.example.Nesflis.dominio.servicio.AdministradorServicioImpl;
import com.example.Nesflis.dominio.servicio.ContenidoServicio;
import com.example.Nesflis.persistencia.entidad.Administrador;
import com.example.Nesflis.persistencia.entidad.Contenido;
import com.example.Nesflis.persistencia.entidad.Genero;
import com.example.Nesflis.persistencia.entidad.Reparto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NesflisApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext contexto = SpringApplication.run(NesflisApplication.class, args);
        ContenidoServicio contenidoService = contexto.getBean(ContenidoServicio.class);
        AdministradorServicioImpl adminImp = contexto.getBean(AdministradorServicioImpl.class);

//        Administrador admin1 = new Administrador();
//        admin1.setNombre("Enano");
//        admin1.setCorreo("Enano@gmail.com");
//        admin1.setContraseña("olaSoyunEnano");
//        adminImp.saveAdmin(admin1);

    }

}
