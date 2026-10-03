package com.iostream.main.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iostream.main.entity.Student;

@Repository
public class DbOperation 
{
	@Autowired
	private EntityManager entityManager;
	
	public void addStudent(Student std)
	{
		EntityTransaction entityTransaction =entityManager.getTransaction();
		try
    	{
    		entityTransaction.begin();
    		entityManager.persist(std);
    		entityTransaction.commit();
    		System.out.println("success");
    	}
    	catch(Exception e)
    	{
    		entityTransaction.rollback();
    		System.out.println("fail");
    		e.printStackTrace();
    		
    	}
    	finally
    	{
    		entityManager.close();
    		
    	}
		
	}

}
