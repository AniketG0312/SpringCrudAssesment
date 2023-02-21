package com.example.SpringDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDemo.Entity.Student;
import com.example.SpringDemo.services.Studentservices;

@RestController
public class controller {
	
	@Autowired
	private Studentservices studentservice;
	
	
	@RequestMapping("/Students")
	public List<Student> getAllStudents()
	{
		return studentservice.getAllStudents();	
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/StudentAdd")
	public void addStudent(@RequestBody Student student) {
		studentservice.addStudent(student);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT,value = "/Studentid/{id}")
	public void updateStudent(@PathVariable int id, @RequestBody Student student) {
		studentservice.updateStudent(student);
	}
	@RequestMapping(method = RequestMethod.DELETE,value ="/Studentdelid/{id}")
	public void DeleteStudent(@PathVariable int id) {
		studentservice.deleteStudent(id);
	}
	
	
	
	
	

}
