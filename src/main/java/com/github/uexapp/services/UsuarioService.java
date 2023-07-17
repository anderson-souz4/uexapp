package com.github.uexapp.services;

import com.github.uexapp.model.Usuario;
import com.github.uexapp.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;


    public Usuario save(Usuario usuario) {
        String senha = usuario.getSenha();
        String senhaCriptografada = BCrypt.hashpw(senha, BCrypt.gensalt());
        usuario.setSenha(senhaCriptografada);

        return usuarioRepository.save(usuario);

    }


}
