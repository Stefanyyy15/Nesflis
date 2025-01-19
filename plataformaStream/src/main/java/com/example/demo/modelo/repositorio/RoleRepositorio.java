/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.modelo.repositorio;

import com.example.demo.modelo.entidades.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author yulie
 */
public interface RoleRepositorio extends JpaRepository<Role, Long>{
    
}
