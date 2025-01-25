package com.example.Nesflis.persistencia.entidad;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Serie extends Contenido {
    @Column(nullable = false)
    private int capitulos;
    @Column(nullable = false)
    private int num_temporadas;
    @Column(nullable = true)
    private String imagenUrl;

    public Serie() {
    }

    public Serie(int capitulos, int num_temporadas, String imagenUrl, Long id_contenido, String titulo, String descripcion, int anio_Estreno, String clasificacion, String tipo, List<Genero> generos, List<Reparto> actores, Administrador administrador) {
        super(id_contenido, titulo, descripcion, anio_Estreno, clasificacion, tipo, generos, actores, administrador);
        this.capitulos = capitulos;
        this.num_temporadas = num_temporadas;
        this.imagenUrl = imagenUrl;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public int getNum_temporadas() {
        return num_temporadas;
    }

    public void setNum_temporadas(int num_temporadas) {
        this.num_temporadas = num_temporadas;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    @Override
    public String toString() {
        return "Serie{" + "capitulos=" + capitulos + ", num_temporadas=" + num_temporadas + ", imagenUrl=" + imagenUrl + '}';
    }
}
