package com.iostream.main.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaConfig 
{
	@Bean
	public EntityManager createEntityManagerObj()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("main-persistence-unit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		return entityManager;
	}

}
