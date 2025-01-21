package com.example.Nesflis.persistencia.entidad;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    @Column(nullable = false, length = 256)
    private String nombre;
    @Column(nullable = false, length = 256, unique = true)
    private String correo;
    @Column(nullable = false, length = 256)
    private String contrasena;
    @Temporal(TemporalType.DATE)
    private Date fecha_registro;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_plan", nullable = false)
    private Plan plan;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Perfil> perfiles = new ArrayList<>();
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Valoracion> valoraciones = new ArrayList<>();

    public Usuario(String nombre, String correo, String contrasena, Date fecha_registro, Plan plan) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.fecha_registro = fecha_registro;
        this.plan = plan;
    }
    
    public Usuario() {}

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public List<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(List<Perfil> perfiles) {
        this.perfiles = perfiles;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", nombre=" + nombre + ", correo=" + correo + ", contrasena=" + contrasena + ", fecha_registro=" + fecha_registro + ", plan=" + plan + ", perfiles=" + perfiles + '}';
    }

    
}
