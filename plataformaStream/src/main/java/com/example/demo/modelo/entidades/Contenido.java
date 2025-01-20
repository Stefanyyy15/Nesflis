package com.example.demo.modelo.entidades;

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

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "contenidoGenero",
            joinColumns = @JoinColumn(name = "id_contenido"),
            inverseJoinColumns = @JoinColumn(name = "id_genero")
    )
    private List<Genero> generos;
    
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "contenidoReparto",
            joinColumns = @JoinColumn(name = "id_contenido"),
            inverseJoinColumns = @JoinColumn(name = "id_reparto")
    )
    private List<Reparto> actores;
    
    @OneToOne
    @JoinColumn(name = "id_administrador")
    private Administrador administrador;
    
    @OneToMany(mappedBy = "contenido", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Valoracion> valoraciones = new ArrayList<>();

    public Contenido(String titulo, String descripcion, int anio_Estreno, String clasificacion, List<Genero> generos, List<Reparto> actores) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.anio_Estreno = anio_Estreno;
        this.clasificacion = clasificacion;
        this.generos = generos;
        this.actores = actores;
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

    @Override
    public String toString() {
        return "Contenido{" + "id_contenido=" + id_contenido + ", titulo=" + titulo + ", descripcion=" + descripcion + ", anio_Estreno=" + anio_Estreno + ", clasificacion=" + clasificacion + ", generos=" + generos + ", actores=" + actores + ", administrador=" + administrador + '}';
    }

}


//       1. Agregar Contenido
//
//        Genero gen1 = new Genero();
//        gen1.setNombre("Utopico");
//        Genero gen2 = new Genero();
//        gen2.setNombre("Violencia");
//
//        Reparto rep1 = new Reparto();
//        rep1.setNombre("Bruno Diaz");
//        Reparto rep2 = new Reparto();
//        rep2.setNombre("Chespirito");
//
//        List<Genero> generos = new ArrayList<>();
//        generos.add(gen1);
//        generos.add(gen2);
//
//        List<Reparto> actores = new ArrayList<>();
//        actores.add(rep1);
//        actores.add(rep2);
//
//        Contenido contenido = new Contenido();
//        contenido.setTitulo("Perros espias 3");
//        contenido.setDescripcion("3 espias perros y un malvado gato. ¿Quien ganará?");
//        contenido.setAnio_Estreno(2023);
//        contenido.setClasificacion("+18");
//
//        contenidoService.agregarContenido(contenido, generos, actores);


//        2. Eliminar Contenido
//         
//        contenidoService.eliminarContenido(Long.valueOf("1"));

//          3. Listar generos de un contenido
//        List<Genero> generos = contenidoService.obtenerGenerosDeUnContenido(Long.valueOf("1"));
//        System.out.println("Generos del Contenido 1:");
//        for (Genero g : generos) {
//            System.out.println(g);
//        }
//        
//          4. Actualizar el administrador de un contenido
//        Administrador admin1 = new Administrador();
//        admin1.setNombre("Juankis");
//        admin1.setCorreo("juankisPotaxie@gmail.com");
//        admin1.setContraseña("amoaU2");
//
//        contenidoService.actualizarAdministradorContenido(Long.valueOf("1"), admin1);
//
//            5. Encontrar Contenido x Año JPQL
//        int anioBusqueda = 2023;
//        List<Contenido> contenidos = contenidoService.obtenerContenidosPorAnio(anioBusqueda);
//
//        if (contenidos.isEmpty()) {
//            System.out.println("No se encontraron contenidos del año " + anioBusqueda);
//        } else {
//            System.out.println("Contenidos del año " + anioBusqueda + ":");
//            for (Contenido contenido : contenidos) {
//                System.out.println(contenido.getTitulo());
//            }
//        }
//    
