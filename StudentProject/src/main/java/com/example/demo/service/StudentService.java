package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

	String addStudent(Student st);
	Student getStudent(int id);
	List<Student> getAllStudent();
	String updateStudent(Student st);
	String deleteStudent(int id);
	
	
}
