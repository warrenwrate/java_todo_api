package com.restful.beginning;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import modules.*;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class TodoResource {

	@Autowired
	private TodoService todoService;
	
	@GetMapping(path="/todos")
	public List<Todo> getAllTodos(){
		return todoService.findAll();
	}
	
	@GetMapping(path="/users/todo/{id}")
	public Todo getTodo(@PathVariable int id){
		System.out.println("getting one Todo item");
		return todoService.findOne(id);
	}
	
	@PostMapping(path="/users/{username}/newTodo")
	public ResponseEntity<Void> addTodo(@RequestBody Todo todo){
		todoService.addTodo(todo);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping(path="/users/{username}/delete/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable int id) {
		Todo deleted = todoService.deleteById(id);
		if(deleted != null) return ResponseEntity.noContent().build();
		else { return ResponseEntity.notFound().build();}
	}
}
