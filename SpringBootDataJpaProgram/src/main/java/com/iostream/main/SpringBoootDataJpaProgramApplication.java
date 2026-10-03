package com.iostream.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.iostream.main.entities.Student;
import com.iostream.main.services.StudentService;
import com.iostream.main.services.StudentServiceImpl;

@SpringBootApplication
public class SpringBoootDataJpaProgramApplication {

	public static void main(String[] args) 
	{
		ApplicationContext context= SpringApplication.run(SpringBoootDataJpaProgramApplication.class, args);
		StudentService stdService=context.getBean(StudentServiceImpl.class);
		 
		
		//--------------insert operation---------
		/*
		 Student std=new Student();
		 std.setName("Sakeen");
		 std.setRollno(659);
		 std.setMarks(967.f);
		 
		 
		 boolean status=stdService.addStudentDetails(std);
		 if(status)
		 {
			 System.out.println("student inserted successfully ");
		 }
		 else
		 {
			 System.out.println("student not inserted due to some error");
		 }
		 
		 */
		 //---------------select operation 1-------------
		 
		/*
		 List<Student> stdList=stdService.getAllStdDetails();
		 
		 for(Student std1 : stdList)
		 {
			 System.out.println("Id :"+std1.getId());
			 System.out.println("Name :"+std1.getName());
			 System.out.println("Roll No :"+std1.getRollno());
			 System.out.println("Marks :"+std1.getMarks());
			 
			 System.out.println("------------------");
			 
		 }
		 
		 */
		
		//--------------------select operation 2------------
		
		/*
		Student std2= stdService.getStdDetails(2L);
		 
		 System.out.println("Id :"+std2.getId());
		 System.out.println("Name :"+std2.getName());
		 System.out.println("Roll No :"+std2.getRollno());
		 System.out.println("Marks :"+std2.getMarks());
		 
		*/ 
		
		//------------------update operation---------
		
		/*
		
		boolean status=stdService.updatStdDetails(2L, 876);
		if(status)
		{
			System.out.println("Student details updated successfully");
		}
		else
		{
			System.out.println("Student details not updated successfully due to some error");
		}
		
		*/
		
		//------------------delete operation-------------------------------
		
		boolean status=stdService.deleteStdDetails(1);
		if(status)
		{
			System.out.println("Student details deleted successfully");
		}
		else
		{
			System.out.println("Student details not deleted successfully due to some error");
		}
		
		
		
		boolean status1=stdService.deleteAllStdDetails();
		if(status1)
		{
			System.out.println("Student details deleted successfully");
		}
		else
		{
			System.out.println("Student details not deleted successfully due to some error");
		}
		
		 
	}
}
