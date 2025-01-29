package com.example.Nesflis.persistencia.entidad;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_plan;
    @Column(nullable = false, length = 256)
    private String nombre;
    @Column(nullable = false)
    private double precio_mensual;
    @Column(nullable = false, length = 256)
    private String calidad_video;
    @Column(nullable = false)
    private int num_perfiles;
    
    @OneToMany(mappedBy = "plan", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER) 
    private List<Usuario> usuarios = new ArrayList<>();

    public Plan(String nombre, double precio_mensual, String calidad_video, int num_perfiles) {
        this.nombre = nombre;
        this.precio_mensual = precio_mensual;
        this.calidad_video = calidad_video;
        this.num_perfiles = num_perfiles;
    }
    public Plan(){
        
    }

    public Long getId_plan() {
        return id_plan;
    }

    public void setId_plan(Long id_plan) {
        this.id_plan = id_plan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio_mensual() {
        return precio_mensual;
    }

    public void setPrecio_mensual(double precio_mensual) {
        this.precio_mensual = precio_mensual;
    }

    public String getCalidad_video() {
        return calidad_video;
    }

    public void setCalidad_video(String calidad_video) {
        this.calidad_video = calidad_video;
    }

    public int getNum_perfiles() {
        return num_perfiles;
    }

    public void setNum_perfiles(int num_perfiles) {
        this.num_perfiles = num_perfiles;
    }
}   
