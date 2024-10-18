package com.example.bimomongoapi.service;

import com.example.bimomongoapi.model.Postagem;
import com.example.bimomongoapi.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Postagem curtirPostagem(String id) {
        Optional<Postagem> postagemOptional = postagemRepository.findById(id);

        if (postagemOptional.isPresent()) {
            Postagem postagem = postagemOptional.get();
            postagem.setiCurtidas(postagem.getiCurtidas() + 1);
            return postagemRepository.save(postagem);
        } else {
            throw new RuntimeException("Postagem não encontrada com ID: " + id);
        }
    }
}
