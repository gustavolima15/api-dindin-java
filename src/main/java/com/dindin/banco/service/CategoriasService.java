package com.dindin.banco.service;

import org.springframework.stereotype.Service;

@Service
public class CategoriasService {
    public void salvarCategoria() {
        System.out.println("Salvando categoria");
    }
    public void deletarCategoria() {
        System.out.println("Deletando categoria");
    }
    public void atualizarCategoria() {
        System.out.println("Atualizando categoria");
    }
    public void listarCategorias() {
        System.out.println("Listando categorias");
    }
}
