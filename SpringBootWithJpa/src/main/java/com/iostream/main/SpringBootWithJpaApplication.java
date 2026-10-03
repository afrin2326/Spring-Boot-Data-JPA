package com.iostream.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.iostream.main.entity.Student;
import com.iostream.main.repository.DbOperation;

@SpringBootApplication
public class SpringBootWithJpaApplication {

	public static void main(String[] args)
	{
		ApplicationContext context= SpringApplication.run(SpringBootWithJpaApplication.class, args);
		DbOperation db=context.getBean(DbOperation.class);
		
		Student std=new Student();
        std.setName("Afrin");
        std.setRollno(12);
        std.setStd_marks(890);
        
        db.addStudent(std);
        
	}

}
