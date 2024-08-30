package com.dindin.banco.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "categorias")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Categorias {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String descricao;
}
