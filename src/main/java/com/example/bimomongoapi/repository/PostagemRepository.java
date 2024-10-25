package com.example.bimomongoapi.repository;

import com.example.bimomongoapi.model.Postagem;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PostagemRepository extends MongoRepository<Postagem, String> {

    Optional<Postagem> findByCID(String s);
}
