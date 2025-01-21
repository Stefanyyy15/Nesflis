package com.example.Nesflis.persistencia.entidad;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Serie extends Contenido {
    @Column(nullable = false)
    private int capitulos;
    @Column(nullable = false)
    private int num_temporadas;

    public Serie(int capitulos, int num_temporadas, String titulo, String descripcion, int anio_Estreno, String clasificacion, List<Genero> generos, List<Reparto> actores) {
        super(titulo, descripcion, anio_Estreno, clasificacion, generos, actores);
        this.capitulos = capitulos;
        this.num_temporadas = num_temporadas;
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
}
