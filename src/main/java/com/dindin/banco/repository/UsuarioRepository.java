package com.dindin.banco.repository;

import java.util.Optional; 
import org.springframework.stereotype.Repository;
import com.dindin.banco.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
