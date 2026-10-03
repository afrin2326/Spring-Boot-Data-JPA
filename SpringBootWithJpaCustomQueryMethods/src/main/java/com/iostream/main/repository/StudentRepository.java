package com.iostream.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iostream.main.entities.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Long> 
{
	@Query(value = "SELECT * FROM std_marks where std_rollno= :stdRollno",nativeQuery = true)
	public Student  myfindStdByRollno(@Param("stdRollno")int rollno);
	
	

}
