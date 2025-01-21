package com.example.Nesflis.persistencia.entidad;

import jakarta.persistence.*;

@Entity
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_perfil;
    @Column(nullable = false, length = 256)
    private String nombre;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_contenido_favorito")
    private Contenido contenidoFavorito;

    public Perfil() {}

    public Perfil(String nombre, Usuario usuario, Contenido contenidoFavorito) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contenidoFavorito = contenidoFavorito;
    }

    public Long getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(Long id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Contenido getContenidoFavorito() {
        return contenidoFavorito;
    }

    public void setContenidoFavorito(Contenido contenidoFavorito) {
        this.contenidoFavorito = contenidoFavorito;
    }

    @Override
    public String toString() {
        return "Perfil{" + "id_perfil=" + id_perfil + ", nombre=" + nombre + ", usuario=" + usuario + ", contenidoFavorito=" + contenidoFavorito + '}';
    }
    
}
