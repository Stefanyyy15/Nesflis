package com.example.Nesflis.persistencia.entidad;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pelicula extends Contenido {
    @Column(nullable = false)
    private int duracion;
    
    @Column(nullable = true)
    private String imagenUrl;

    public Pelicula(int duracion, String imagenUrl, String titulo, String descripcion, int anio_Estreno, String clasificacion, List<Genero> generos, List<Reparto> actores) {
        super(titulo, descripcion, anio_Estreno, clasificacion, generos, actores);
        this.duracion = duracion;
        this.imagenUrl = imagenUrl;
    }   
    
    public Pelicula(){
        
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "duracion=" + duracion + ", imagenUrl=" + imagenUrl + '}';
    }
}
