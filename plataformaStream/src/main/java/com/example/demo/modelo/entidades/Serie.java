package com.example.demo.modelo.entidades;

import jakarta.persistence.*;
import java.util.List;

public class Serie extends Contenido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_serie;
    @Column(nullable = false)
    private int capitulos;
    @Column(nullable = false)
    private int num_temporadas;

    public Serie(int capitulos, int num_temporadas, String titulo, String descripcion, int anio_Estreno, String clasificacion, List<Genero> generos, List<Reparto> actores) {
        super(titulo, descripcion, anio_Estreno, clasificacion, generos, actores);
        this.capitulos = capitulos;
        this.num_temporadas = num_temporadas;
    }
    
    public Long getId_serie() {
        return id_serie;
    }

    public void setId_serie(Long id_serie) {
        this.id_serie = id_serie;
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
