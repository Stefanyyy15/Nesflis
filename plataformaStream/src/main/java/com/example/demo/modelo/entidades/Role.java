
package com.example.demo.modelo.entidades;

import jakarta.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String role;

    public Role() {
    }

    public Role(String role) {
        this.role = role;
    }
    
    

    public Long getId() {
        return id;
    }
}
