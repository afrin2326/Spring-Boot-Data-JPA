package com.iostream.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iostream.main.entities.Student;
import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> 
{
	public Student  findByRollno(int rollno);
	
	public List<Student> findByMarksGreaterThan(float marks);

}
