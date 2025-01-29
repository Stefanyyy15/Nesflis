
package com.example.Nesflis.persistencia.entidad;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Reparto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(length = 50)
    private String rol;
    
    @ManyToMany(mappedBy = "actores")
    @JsonIgnore
    private List<Contenido> contenidos;

    public Reparto(String nombre, String rol, List<Contenido> contenidos) {
        this.nombre = nombre;
        this.rol = rol;
        this.contenidos = contenidos;
    }
    
    public Reparto(){
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    @Override
    public String toString() {
        return "Reparto{" + "id=" + id + ", nombre=" + nombre + ", rol=" + rol + ", contenidos=" + contenidos + '}';
    }
    
    
}
