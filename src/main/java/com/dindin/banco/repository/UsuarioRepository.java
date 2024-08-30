package com.dindin.banco.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dindin.banco.model.Usuario;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}