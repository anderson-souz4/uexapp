package com.github.uexapp.services;

import com.github.uexapp.model.Contato;
import com.github.uexapp.model.Endereco;
import com.github.uexapp.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EnderecoService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;


    public void salvar(Endereco contato) {
        enderecoRepository.save(contato);
    }

    public void deletar(Long id) {
        enderecoRepository.deleteById(id);
    }

    public Endereco buscar(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }

    public void atualizar(Endereco contato) {
        enderecoRepository.save(contato);
    }

    public void listarTodos(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Endereco> resultados = enderecoRepository.findAll(pageable);
        resultados.getContent().forEach(System.out::println);
    }

    public Endereco buscarEnderecoPorCep(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        RestTemplate restTemplate = new RestTemplate();
        Endereco endereco = restTemplate.getForObject(url, Endereco.class);
        return endereco;
    }

}
