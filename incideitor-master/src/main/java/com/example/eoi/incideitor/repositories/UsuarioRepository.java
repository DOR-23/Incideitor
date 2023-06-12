package com.example.eoi.incideitor.repositories;

import com.example.eoi.incideitor.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findUsuarioByEmail(String email);
    Optional<Usuario> findUsuarioByEmailAndContrasena(String email,String contrasena);


}