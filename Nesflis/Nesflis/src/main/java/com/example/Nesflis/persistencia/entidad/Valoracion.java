
package com.example.Nesflis.persistencia.entidad;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Valoracion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_valoracion;

    @Column(nullable = false) 
    private int puntuacion;

    @Column(nullable = false,length = 500) 
    private String comentario;

    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @ManyToOne(optional = false) 
    @JoinColumn(name = "id_usuario", nullable = false)
    @JsonIgnore
    private Usuario usuario;

    @ManyToOne(optional = false) 
    @JoinColumn(name = "id_contenido", nullable = false)
    @JsonIgnore    
    private Contenido contenido;

    public Valoracion(Usuario usuario, Contenido contenido, int puntuacion, String comentario, Date fecha) {
        this.usuario = usuario;
        this.contenido = contenido;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.fecha = fecha;
    }
    
    public Long getId() {
        return id_valoracion;
    }

    public void setId(Long id) {
        this.id_valoracion = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
