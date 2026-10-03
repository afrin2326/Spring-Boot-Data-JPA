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
	private StudentRepository studentRepository ;

	@Override
	public boolean addStudentDetails(Student std) 
	{
		boolean status=false;
		
		try
		{
			studentRepository.save(std);
			status=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			status=false;
		}
		
		
		return false;
	}

	@Override
	public List<Student> getAllStdDetails()
	{
		
		return studentRepository.findAll() ;
	}

	@Override
	public Student getStdDetails(Long id)
	{
		Optional<Student> optional=studentRepository.findById(id);
		if(optional.isPresent())
		{
			return optional.get();
		}
		else
		{
			return null;
		}
		
	}

	@Override
	public boolean updatStdDetails(long id, float marks)
	{
		Student std3=getStdDetails(id);
		if(std3!=null)
		{
			std3.setMarks(marks);
			studentRepository.save(std3);
			
			return true;
		}


		return false;
	}

	@Override
	public boolean deleteStdDetails(int id) 
	{
		
		return false;
	}

	@Override
	public boolean deleteAllStdDetails()
	{
		
		return false;
	}
	
	

}
