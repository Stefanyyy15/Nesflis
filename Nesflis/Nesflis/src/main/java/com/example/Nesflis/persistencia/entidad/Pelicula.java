package com.example.Nesflis.persistencia.entidad;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pelicula extends Contenido {
    @Column(nullable = false)
    private int duracion;
    
    @Column(nullable = true)
    private String imagenUrl;

    public Pelicula(int duracion, String imagenUrl, Long id_contenido, String titulo, String descripcion, int anio_Estreno, String clasificacion, String tipo, List<Genero> generos, List<Reparto> actores, Administrador administrador) {
        super(id_contenido, titulo, descripcion, anio_Estreno, clasificacion, tipo, generos, actores, administrador);
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
