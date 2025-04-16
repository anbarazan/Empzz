package com.example.Studentdemo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Student, Integer>{

}
