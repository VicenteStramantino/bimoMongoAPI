package com.example.bimomongoapi.service;

import com.example.bimomongoapi.model.Postagem;
import com.example.bimomongoapi.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostagemService {

    @Autowired
    private PostagemRepository postagemRepository;

    public List<Postagem> buscarTodas() {
        return postagemRepository.findAll();
    }

    public Postagem inserir(Postagem postagem) {
        return postagemRepository.save(postagem);
    }

    public void deletar(String id) {
        postagemRepository.deleteById(id);
    }
}
