package com.iostream.main.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iostream.main.entities.Student;


public interface StudentService  
{
	
	public Student getStdDetailsByRollno(int rollno);
	
	public List<Student> getAllStdDetailsByMarks(float marks);
	
	
	
	
}

