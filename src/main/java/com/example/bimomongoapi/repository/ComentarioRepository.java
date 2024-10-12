package com.example.bimomongoapi.repository;

import com.example.bimomongoapi.model.Comentario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ComentarioRepository extends MongoRepository<Comentario, String> {
}
