package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

//esta anotação identifica que a classe é um recurso web que é implementado por um controlador rest
@RestController
@RequestMapping(value = "/users") // nomeia o recurso
public class UserResource {
	// criação de um metodo que sera o endpoint para acessar os usuários
	
	//retorna para uma requisição do tipo get
	@GetMapping	
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "999999", "12345");
		return ResponseEntity.ok().body(u);
		
	}
}
