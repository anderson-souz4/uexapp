package com.github.uexapp.services;

import com.github.uexapp.model.Contato;
import com.github.uexapp.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;


    public void salvar(Contato contato) {
        contatoRepository.save(contato);
    }

    public void deletar(Long id) {
        contatoRepository.deleteById(id);
    }

    public Contato buscar(Long id) {
        return contatoRepository.findById(id).orElse(null);
    }

    public void atualizar(Contato contato) {
        contatoRepository.save(contato);
    }

    public void listarTodos() {
        contatoRepository.findAll().forEach(System.out::println);
    }

    public Contato buscarPorNome(String nome) {
        return contatoRepository.findByNome(nome);
    }

}
