package com.example.Nesflis.persistencia.entidad;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.Optional;

@Entity
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_perfil;
    @Column(nullable = false, length = 256)
    private String nombre;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_usuario", nullable = false)
    @JsonBackReference  
    private Usuario usuario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_contenido_favorito")
    @JsonIgnore
    private Contenido contenidoFavorito;

    public Perfil() {
    }

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
    
    public Optional<Usuario> getUsuario() {
        return Optional.ofNullable(usuario);
    }

    public void setUsuario(Optional<Usuario> usuario) {
        usuario.ifPresent(usser -> this.usuario = usser);
    }

    public Optional<Contenido> getContenidoFavorito() {
        return Optional.ofNullable(contenidoFavorito);
    }

    public void setContenidoFavorito(Optional<Contenido> contenidoFavorito) {
        contenidoFavorito.ifPresent(contenido -> this.contenidoFavorito = contenido);
    }

    @Override
    public String toString() {
        return "Perfil{" + "id_perfil=" + id_perfil + ", nombre=" + nombre + ", usuario=" + usuario + ", contenidoFavorito=" + contenidoFavorito + '}';
    }

}
