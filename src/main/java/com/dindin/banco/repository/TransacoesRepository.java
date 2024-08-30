package com.dindin.banco.repository;

import org.springframework.stereotype.Repository;
import com.dindin.banco.model.Transacoes;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TransacoesRepository extends JpaRepository<Transacoes, Long> {

}
