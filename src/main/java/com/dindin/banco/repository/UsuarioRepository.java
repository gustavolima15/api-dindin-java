package com.dindin.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dindin.banco.model.Usuario;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByEmail(String email);
}