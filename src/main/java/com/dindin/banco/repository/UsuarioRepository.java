package com.dindin.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dindin.banco.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    //Optional<Usuario> findByEmail(String email);
}