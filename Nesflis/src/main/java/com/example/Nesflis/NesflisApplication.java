package com.example.Nesflis;

import com.example.Nesflis.dominio.servicio.ContenidoServicio;
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
            
            
        Genero gen1 = new Genero();
        gen1.setNombre("Utopico");
        Genero gen2 = new Genero();
        gen2.setNombre("Violencia");

        Reparto rep1 = new Reparto();
        rep1.setNombre("Bruno Diaz");
        Reparto rep2 = new Reparto();
        rep2.setNombre("Chespirito");

        List<Genero> generos = new ArrayList<>();
        generos.add(gen1);
        generos.add(gen2);

        List<Reparto> actores = new ArrayList<>();
        actores.add(rep1);
        actores.add(rep2);

        Contenido contenido = new Contenido();
        contenido.setTitulo("Perros espias 3");
        contenido.setDescripcion("3 espias perros y un malvado gato. ¿Quien ganará?");
        contenido.setAnio_Estreno(2023);
        contenido.setClasificacion("+18");

        contenidoService.agregarContenido(contenido, generos, actores);
	}

}
