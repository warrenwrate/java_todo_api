package com.restful.beginning;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import modules.*;

//Controller
@RestController
public class HomeController {
	
	//GET
	//URI - /helloworld
	//method - "Hello World"
	@GetMapping(path="/basichello")
	public String basic() {
		return "Hello World - Warren What is going on.";
	}
	
	@GetMapping(path="/getHelloItem/{id}")
	public HelloWold getItem(@PathVariable("id") String index) {
		int ind = Integer.parseInt(index);
				
		ArrayList<HelloWold> list = new ArrayList<HelloWold>();
		list.add(new HelloWold("message one"));
		list.add(new HelloWold("two is a shoe"));
		list.add(new HelloWold("three is a tree"));
		list.add(new HelloWold("four is a bore"));
		
		return list.get(ind);
	}
	
	@GetMapping(path="/helloworld")
	public HelloWold helloWorld() {
		HelloWold hello = new HelloWold("Hello this is from Module");
		return hello;
	}
	
	@GetMapping(path="/hellolist")
	public ArrayList<HelloWold> hellolist(){
		
		ArrayList<HelloWold> list = new ArrayList<HelloWold>();
		list.add(new HelloWold("message one"));
		list.add(new HelloWold("two is a shoe"));
		list.add(new HelloWold("three is a tree"));
		list.add(new HelloWold("four is a bore"));
		
		return list;
	}

}
