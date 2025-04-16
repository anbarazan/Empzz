package com.example.Studentdemo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface headRepo extends MongoRepository<Head, Integer> {

	Head findByUsername(String username);

}
