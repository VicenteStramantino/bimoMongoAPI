package com.example.bimomongoapi.repository;

import com.example.bimomongoapi.model.Postagem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostagemRepository extends MongoRepository<Postagem, String> {
}
