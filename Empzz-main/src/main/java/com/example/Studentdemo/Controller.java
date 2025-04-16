package com.example.Studentdemo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class Controller {

	@Autowired
	public Repository repo;

	@RequestMapping("/")
	public String Greet(HttpServletRequest r) {
		return "Hi! There...." + "Session Id : " + r.getSession().getId();
	}

	// generating token to perform post,put,delete requests
//	@GetMapping("/token")
//	public CsrfToken token(HttpServletRequest r) {
//		return (CsrfToken) r.getAttribute("_csrf");
//	}

	@PostMapping("/student")
	public Student add(@RequestBody Student s) {
		return repo.save(s);
	}

	@GetMapping("/student")
	public List<Student> getAll() {
		return (List<Student>) repo.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Student> getById(@PathVariable int id) {
		return repo.findById(id);
	}

	@PutMapping("/{id}")
	public Student update(@PathVariable int id, @RequestBody Student s) {
		return repo.save(s);
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		repo.deleteById(id);
		return "Deleted SuccessFully...";
	}
}
