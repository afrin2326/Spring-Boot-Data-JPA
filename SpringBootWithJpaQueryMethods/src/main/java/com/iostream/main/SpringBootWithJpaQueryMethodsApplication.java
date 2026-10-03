package com.iostream.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.iostream.main.entities.Student;
import com.iostream.main.services.StudentService;
import com.iostream.main.services.StudentServiceImpl;

@SpringBootApplication
public class SpringBootWithJpaQueryMethodsApplication {

	public static void main(String[] args) 
	{
		ApplicationContext context= SpringApplication.run(SpringBootWithJpaQueryMethodsApplication.class, args);
		StudentService  st=context.getBean(StudentServiceImpl.class);
		
		
		/*
		Student s1=st.getStdDetailsByRollno(101);
		 
		System.out.println("------------------------");
		System.out.println("Id :"+s1.getId());
		System.out.println("Name :"+s1.getName());
		System.out.println("Roll No :"+s1.getRollno());
		System.out.println("Marks :"+s1.getMarks());
		System.out.println("-------------------------");
		
		*/
		
		List<Student> std_list=st.getAllStdDetailsByMarks(90f);
		
		for(Student s:std_list)
		{
			System.out.println("------------------------");
			System.out.println("Id :"+s.getId());
			System.out.println("Name :"+s.getName());
			System.out.println("Roll No :"+s.getRollno());
			System.out.println("Marks :"+s.getMarks());
			System.out.println("-------------------------");
		}
		
		
	}

}
