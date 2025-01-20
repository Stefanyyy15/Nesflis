
package com.example.demo.modelo.entidades;

import jakarta.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
<<<<<<< HEAD
    
    private String role;

    public Role() {
    }

    public Role(String role) {
        this.role = role;
    }
    
    
=======
    private String role;

    public Role(Long id, String role) {
        this.id = id;
        this.role = role;
    }
    
    public Role() {
    }
>>>>>>> 787cf309e2b32b7754e031eb2b10b0b36ee20dbb

    public Long getId() {
        return id;
    }
<<<<<<< HEAD
=======

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
        
    }

    @Override
    public String toString() {
        return "Role{" + "id=" + id + ", role=" + role + '}';
    }
    

>>>>>>> 787cf309e2b32b7754e031eb2b10b0b36ee20dbb
}
