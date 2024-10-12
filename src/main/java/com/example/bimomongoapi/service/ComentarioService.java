package com.example.bimomongoapi.service;

import com.example.bimomongoapi.model.Comentario;
import com.example.bimomongoapi.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    public List<Comentario> buscarTodos() {
        return comentarioRepository.findAll();
    }

    public Comentario inserir(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    public void deletar(String id) {
        comentarioRepository.deleteById(id);
    }
}
