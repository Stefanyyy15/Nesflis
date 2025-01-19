package com.example.demo.modelo.entidades;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pelicula extends Contenido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Pelicula;
    @Column(nullable = false)
    private int duracion;

    public Pelicula(int duracion, String titulo, String descripcion, int anio_Estreno, String clasificacion, List<Genero> generos, List<Reparto> actores) {
        super(titulo, descripcion, anio_Estreno, clasificacion, generos, actores);
        this.duracion = duracion;
    }    

    public Long getId_Pelicula() {
        return id_Pelicula;
    }

    public void setId_Pelicula(Long id_Pelicula) {
        this.id_Pelicula = id_Pelicula;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
