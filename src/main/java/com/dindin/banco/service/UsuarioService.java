package com.dindin.banco.service;

import com.dindin.banco.model.Usuario;
import com.dindin.banco.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario salvarUsuario (Usuario usuario) {
        return repository.saveAndFlush(usuario);
    }
}
