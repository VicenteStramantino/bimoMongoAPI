package com.example.bimomongoapi.service;

import com.example.bimomongoapi.model.Curtida;
import com.example.bimomongoapi.repository.CurtidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurtidaService {

    @Autowired
    private CurtidaRepository curtidaRepository;

    public List<Curtida> buscarTodas() {
        return curtidaRepository.findAll();
    }

    public Curtida inserir(Curtida curtida) {
        return curtidaRepository.save(curtida);
    }

    public void deletar(String id) {
        curtidaRepository.deleteById(id);
    }
}
