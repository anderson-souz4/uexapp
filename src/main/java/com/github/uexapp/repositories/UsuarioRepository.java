package com.github.uexapp.repositories;

import com.github.uexapp.model.Contato;
import com.github.uexapp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByLogin(String login);
}
