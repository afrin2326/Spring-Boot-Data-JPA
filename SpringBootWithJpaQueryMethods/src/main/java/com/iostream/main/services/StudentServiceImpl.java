package com.iostream.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iostream.main.entities.Student;
import com.iostream.main.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student getStdDetailsByRollno(int rollno)
	{
		return studentRepository.findByRollno(rollno);
		
	}

	@Override
	public List<Student> getAllStdDetailsByMarks(float marks)
	{
		
		return studentRepository.findByMarksGreaterThan(marks);
	}

	

}
