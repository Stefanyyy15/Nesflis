package com.example.demo.modelo.entidades;

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
    
    
        
////                1. Agregar Genero
//         Genero gen8 = new Genero();
//       gen8.setNombre("Romance");
//       generoService.saveGenero(gen8);
//
////        2. Listar Generos
//         generoService.listarGeneros();
//        
////          3. Encontrar servicio x ID
//        Optional<Genero> generoEncontrado = generoService.encontrarGenero(Long.valueOf("2"));
//        generoEncontrado.ifPresent(g -> System.out.println("Género encontrado: " + g.getNombre()));
//
////            4. Eliminar Genero
//          generoService.delGenero(Long.valueOf("3"));
//        
        
//
}
