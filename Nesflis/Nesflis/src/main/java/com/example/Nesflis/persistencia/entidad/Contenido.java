package com.example.Nesflis.persistencia.entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "contenido")
public class Contenido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_contenido;
    
    @Column(nullable = false, length = 256)
    private String titulo;
    @Column(columnDefinition = "TEXT")
    private String descripcion;

    @Column(nullable = false)
    private int anio_Estreno;

    @Column(nullable = false, length = 256)
    private String clasificacion;
    
    @Column(nullable = false, length = 256)
    private String tipo;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "contenidoGenero",
            joinColumns = @JoinColumn(name = "id_contenido"),
            inverseJoinColumns = @JoinColumn(name = "id_genero")
    )
    @JsonIgnore
    private List<Genero> generos;
    
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "contenidoReparto",
            joinColumns = @JoinColumn(name = "id_contenido"),
            inverseJoinColumns = @JoinColumn(name = "id_reparto")
    )
    @JsonIgnore
    private List<Reparto> actores;
    
    @OneToOne
    @JoinColumn(name = "id_administrador")
    private Administrador administrador;
    
    @OneToMany(mappedBy = "contenido", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Valoracion> valoraciones = new ArrayList<>();
    
    @ManyToMany(mappedBy = "contenidosFavoritos")
    @JsonIgnore
    private List<Perfil> perfiles = new ArrayList<>();

    public Contenido(Long id_contenido, String titulo, String descripcion, int anio_Estreno, String clasificacion, String tipo, List<Genero> generos, List<Reparto> actores, Administrador administrador) {
        this.id_contenido = id_contenido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.anio_Estreno = anio_Estreno;
        this.clasificacion = clasificacion;
        this.tipo = tipo;
        this.generos = generos;
        this.actores = actores;
        this.administrador = administrador;
    }

    public Contenido(String titulo) {
        this.titulo = titulo;
    }
    
    
    
    public Contenido() {}


    public Long getId_contenido() {
        return id_contenido;
    }

    public void setId_contenido(Long id_contenido) {
        this.id_contenido = id_contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnio_Estreno() {
        return anio_Estreno;
    }

    public void setAnio_Estreno(int anio_Estreno) {
        this.anio_Estreno = anio_Estreno;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }    

    public List<Reparto> getActores() {
        return actores;
    }

    public void setActores(List<Reparto> actores) {
        this.actores = actores;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Valoracion> getValoraciones() {
        return valoraciones;
    }

    public void setValoraciones(List<Valoracion> valoraciones) {
        this.valoraciones = valoraciones;
    }

    @Override
    public String toString() {
        return "Contenido{" + "id_contenido=" + id_contenido + ", titulo=" + titulo + ", descripcion=" + descripcion + ", anio_Estreno=" + anio_Estreno + ", clasificacion=" + clasificacion + ", generos=" + generos + ", actores=" + actores + ", administrador=" + administrador + '}';
    }

}
