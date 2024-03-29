package com.github.uexapp.repositories;

import com.github.uexapp.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
    Contato findByNome(String nome);
}
