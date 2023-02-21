package com.example.SpringDemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.SpringDemo.Dao.StudentRepository;
import com.example.SpringDemo.Entity.Student;

@Service
public class Studentservices {

	@Autowired
	public StudentRepository studentRepo;
	
	public List<Student>getAllStudents(){
		
		List<Student>student=new ArrayList<>();
		studentRepo.findAll().forEach(student::add);
		return student;
	}

	public void addStudent(Student student) {
		studentRepo.save(student);
		
	}

	public void updateStudent(Student student) {
		studentRepo.save(student);
	}

	public void deleteStudent(int id) {
		
		studentRepo.deleteById(id);
	}

	
	
	
	
	
}
