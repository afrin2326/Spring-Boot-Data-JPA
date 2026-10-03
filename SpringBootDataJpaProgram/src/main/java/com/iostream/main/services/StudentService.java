package com.iostream.main.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iostream.main.entities.Student;


public interface StudentService  
{
	public boolean addStudentDetails(Student std);
	
	public List<Student> getAllStdDetails();
	
	public Student getStdDetails(Long id);
	
	public boolean updatStdDetails(long id,float marks);
	
	public boolean deleteStdDetails(int id);
	
	public boolean deleteAllStdDetails();

}

