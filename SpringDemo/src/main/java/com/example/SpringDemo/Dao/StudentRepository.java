package com.example.SpringDemo.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringDemo.Entity.Student;

@org.springframework.stereotype.Repository
public interface  StudentRepository extends CrudRepository<Student, Integer>{

}
