# Spring Boot Data JPA Practice

A collection of Spring Boot practice projects focused on **JPA, Hibernate, Spring Data JPA, repository-based database operations, and custom query methods** using Java, Spring Boot, and MySQL.

## 📌 Overview

This repository contains hands-on projects developed while learning and practicing database integration with Spring Boot. The projects demonstrate different approaches to working with **JPA and Hibernate**, from basic database operations to repository-based and custom query implementations.

## 📂 Projects

### 1. SpringBootDataJpaProgram

A basic Spring Data JPA application demonstrating:

* Entity mapping
* JPA repository
* CRUD operations
* Service layer implementation
* MySQL database integration

### 2. SpringBootHibernateProgram

A Hibernate-focused Spring Boot application demonstrating:

* Hibernate ORM
* Entity mapping
* Repository-based database operations
* MySQL integration

### 3. SpringBootWithJpa

A JPA-based application demonstrating:

* JPA configuration
* `persistence.xml`
* Entity management
* Database operations
* JPA with Hibernate

### 4. SpringBootWithJpaCustomQueryMethods

A Spring Data JPA project demonstrating:

* Repository interfaces
* Custom query methods
* Derived query methods
* Service-layer implementation
* Entity-based database operations

### 5. SpringBootWithJpaQueryMethods

A Spring Data JPA project focused on:

* Query method implementation
* Repository abstraction
* CRUD operations
* Derived queries
* Service-layer architecture

## 🛠️ Technologies Used

* **Java**
* **Spring Boot**
* **Spring Data JPA**
* **JPA**
* **Hibernate**
* **MySQL**
* **Maven**
* **Git & GitHub**

## 📚 Concepts Covered

* JPA fundamentals
* Hibernate ORM
* Entity and table mapping
* Repository pattern
* Spring Data JPA repositories
* CRUD operations
* Derived query methods
* Custom query methods
* Service layer
* Dependency Injection
* MySQL database connectivity
* `persistence.xml` configuration
* Database-driven Spring Boot applications

## ⚙️ Requirements

Before running the projects, make sure you have:

* Java 17 or later
* Maven
* MySQL Server
* Git

## 🚀 Getting Started

Clone the repository:

```bash
git clone https://github.com/afrin2326/Spring-Boot-Data-JPA.git
```

Navigate to any project:

```bash
cd SpringBootDataJpaProgram
```

Build the project:

```bash
mvn clean install
```

Run the application:

```bash
mvn spring-boot:run
```

You can follow the same process for the other projects in this repository.

## 🔐 Database Configuration

Database credentials are intentionally **not stored in the repository**.

The projects using Spring Boot datasource configuration expect the following environment variables:

```text
DB_URL
DB_USERNAME
DB_PASSWORD
```

Example:

```text
DB_URL=jdbc:mysql://localhost:3306/your_database
DB_USERNAME=your_username
DB_PASSWORD=your_password
```

Set these values according to your local MySQL configuration before running the relevant application.

> Never commit real database passwords, API keys, tokens, or other sensitive credentials to GitHub.

## 📁 Repository Structure

```text
Spring-Boot-Data-JPA/
│
├── SpringBootDataJpaProgram/
│
├── SpringBootHibernateProgram/
│
├── SpringBootWithJpa/
│
├── SpringBootWithJpaCustomQueryMethods/
│
├── SpringBootWithJpaQueryMethods/
│
├── .gitignore
└── README.md
```

## 🎯 Learning Objectives

The main purpose of this repository is to build a practical understanding of:

* Database integration in Spring Boot
* JPA and Hibernate
* Spring Data JPA
* Repository-based architecture
* Query method development
* CRUD application development
* Clean separation between entity, repository, and service layers

## 👩‍💻 Author

**Mst Afrin Binte Amin**

Computer Science & Engineering
Machine Learning & Software Development Enthusiast

GitHub: [afrin2326](https://github.com/afrin2326)

---

⭐ If you find this repository useful, feel free to explore the individual projects and their implementations.
