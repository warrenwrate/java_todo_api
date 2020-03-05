package com.restful.beginning;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import modules.Todo;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "Create a React App", false, new Date(), "warrenwrate"));
		todos.add(new Todo(++idCounter, "Create a Rest API", false, new Date(), "warrenwrate"));
		todos.add(new Todo(++idCounter, "Create DockerFiles", false, new Date(), "warrenwrate"));
		todos.add(new Todo(++idCounter, "Create a Kubernetes Infrastructure", false, new Date(), "warrenwrate"));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo deleteById(int id) {
		Todo todo = findById(id);
		todos.remove(todo);
		return todo;
	}
	
	public Todo findOne(int id) {
		Todo todo = findById(id);
		return todo;
	}
	
	public Todo addTodo(Todo todo) {
		todos.add(todo);
		return todo;
	}
	
	private Todo findById(int id) {
		List<Todo> found = todos.stream().filter(x -> (x.getId() == id)).collect(Collectors.toList());
		return found.get(0);
	}

}
