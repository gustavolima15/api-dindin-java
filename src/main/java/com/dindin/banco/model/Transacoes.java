package com.dindin.banco.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "transacoes")
@Data
@AllArgsConstructor
@NoArgsConstructor



public class Transacoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String descricao;
    Double valor;
    String data;
    @ManyToOne
    Categorias categoria;
    @ManyToOne
    Usuario usuario;
    String tipo;
}
