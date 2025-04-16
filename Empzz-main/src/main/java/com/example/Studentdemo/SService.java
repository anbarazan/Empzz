package com.example.Studentdemo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SService {

	@Autowired
	public Repository repo;

	public Student Add(Student s) {
		return repo.save(s);
	}

	public List<Student> GetAll() {
		return (List<Student>) repo.findAll();
	}

	public Optional<Student> GetById(int id) {
		return repo.findById(id);
	}

	public Student Update(int id, Student s) throws Exception {
		return repo.findById(id).map(student -> {
			student.setName(s.getName());
			student.setMark(s.getMark());
			return repo.save(s);
		}).orElseThrow(() -> new RuntimeException("Not Found,,,"));
	}
	
	public void Delete(int id) {
		 repo.deleteById(id);
	}
}
