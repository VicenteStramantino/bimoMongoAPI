package com.example.bimomongoapi.repository;

import com.example.bimomongoapi.model.Curtida;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CurtidaRepository extends MongoRepository<Curtida, String> {
}
