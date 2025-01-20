package com.example.demo.modelo.entidades;

import jakarta.persistence.*;

@Entity
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_administrador;

    @Column(nullable = false, length = 100) 
    private String nombre;

    @Column(nullable = false, unique = true, length = 150)
    private String correo;

    @Column(nullable = false) 
    private String contraseña;
    
    @OneToOne(mappedBy = "administrador")
    private Contenido contenido;

    public Administrador(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }
    
    public Administrador(){
        
    }

    public Long getId() {
        return id_administrador;
    }

    public void setId(Long id) {
        this.id_administrador = id;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Administrador{" + "id_administrador=" + id_administrador + ", nombre=" + nombre + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", contenido=" + contenido + '}';
    }
    
    
}

//        1. Agregar admin
//       Administrador admin1 = new Administrador();
//       admin1.setNombre("Stefa");
//       admin1.setCorreo("tefa@gmail.com");
//       admin1.setContraseña("minionsXpitufos");
//       adminService.saveAdmin(admin1);

//        2. listar Admin
//         adminService.listarAdmin();

//        3. Encontrar admin x ID
//        Optional<Administrador> ola = adminService.encontrarAdmin(Long.valueOf("1"));
//        System.out.println(ola);

//          4. Eliminar Admin
//          adminService.delAdministrador(Long.valueOf("1"));

//        5. Encontrar Administrador x Correo JPQL
//        Optional<Administrador> idk = adminService.encontrarPorCorreo("juankisPotaxie@gmail.com");
//        idk.ifPresent(a -> System.out.println("Administrador Encontrado: " + a.getNombre() + a.getContraseña()));