package com.dindin.banco.service;

import org.springframework.stereotype.Service;


@Service
public class TransacoesService {
    public void salvarTransacao() {
        System.out.println("Salvando transação");
    }
    public void deletarTransacao() {
        System.out.println("Deletando transação");
    }
    public void atualizarTransacao() {
        System.out.println("Atualizando transação");
    }
    public void listarTransacoes() {
        System.out.println("Listando transações");
    }
}
