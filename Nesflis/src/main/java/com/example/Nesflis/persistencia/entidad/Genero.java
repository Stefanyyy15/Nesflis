package com.example.Nesflis.persistencia.entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_genero;
    @Column(nullable = false, length = 265)
    private String nombre;
    
    @ManyToMany(mappedBy = "generos")
    @JsonIgnore
    private List<Contenido> contenidos;

    public Genero(String nombre, List<Contenido> contenidos) {
        this.nombre = nombre;
        this.contenidos = contenidos;
    }
    
    public Genero(){
        
    }

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    public Long getId_genero() {
        return id_genero;
    }

    public void setId_genero(Long id_genero) {
        this.id_genero = id_genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Genero{" + "id_genero=" + id_genero + ", nombre=" + nombre + ", contenidos=" + contenidos + '}';
    }
}
