package com.github.uexapp.repositories;

import com.github.uexapp.model.Contato;
import com.github.uexapp.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
