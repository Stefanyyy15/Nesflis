package com.example.demo.modelo.entidades;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

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

// // 1. Agregar Serie
// Serie serie1 = new Serie(10, 2, "Breaking Bad", "Un profesor se convierte en narcotraficante", 2008, "TV-MA", null, null);
// serieService.guardarSerie(serie1);
// System.out.println("Serie guardada: " + serie1.getTitulo());
//
// // 2. Listar todas las series
// System.out.println("Listado de series:");
// serieService.obtenerSeries().forEach(serie -> System.out.println(serie.getTitulo()));
//
// // 3. Encontrar Serie por ID
// Optional<Serie> serieEncontrada = serieService.obtenerSeriePorId(serie1.getId());
// serieEncontrada.ifPresent(serie -> System.out.println("Serie encontrada por ID: " + serie.getTitulo()));
//
// // 4. Eliminar Serie
// serieService.eliminarSerie(serie1.getId());
// System.out.println("Serie eliminada con ID: " + serie1.getId());
//
// // 5. Intentar encontrar la serie eliminada
// Optional<Serie> serieEliminada = serieService.obtenerSeriePorId(serie1.getId());
// if (serieEliminada.isEmpty()) {
//     System.out.println("La serie fue eliminada correctamente.");
// } else {
//     System.out.println("Error: La serie aún existe.");
// }