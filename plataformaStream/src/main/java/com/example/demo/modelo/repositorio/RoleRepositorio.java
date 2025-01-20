package com.example.demo.modelo.repositorio;


import com.example.demo.modelo.entidades.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepositorio extends JpaRepository<Role, Long> {
}
