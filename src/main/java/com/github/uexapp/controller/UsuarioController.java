package com.github.uexapp.controller;

import com.github.uexapp.model.Usuario;
import com.github.uexapp.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/usuario")
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }
}
