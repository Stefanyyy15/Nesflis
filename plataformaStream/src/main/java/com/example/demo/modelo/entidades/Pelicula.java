package com.example.demo.modelo.entidades;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pelicula extends Contenido {
    @Column(nullable = false)
    private int duracion;

    public Pelicula(int duracion, String titulo, String descripcion, int anio_Estreno, String clasificacion, List<Genero> generos, List<Reparto> actores) {
        super(titulo, descripcion, anio_Estreno, clasificacion, generos, actores);
        this.duracion = duracion;
    }    
    
    public Pelicula(){
        
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
<<<<<<< HEAD
=======
    
>>>>>>> 787cf309e2b32b7754e031eb2b10b0b36ee20dbb
}
