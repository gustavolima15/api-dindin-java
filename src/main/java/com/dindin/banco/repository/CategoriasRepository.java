package com.dindin.banco.repository;

import org.springframework.stereotype.Repository;
import com.dindin.banco.model.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long> {

}
