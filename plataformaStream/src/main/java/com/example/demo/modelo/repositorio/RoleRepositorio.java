package com.example.demo.modelo.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.entidades.Role;

@Repository
public interface RoleRepositorio extends JpaRepository<Role, Long> {
}
