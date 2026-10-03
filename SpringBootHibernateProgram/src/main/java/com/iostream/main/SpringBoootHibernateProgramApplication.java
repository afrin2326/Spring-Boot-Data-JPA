package com.iostream.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iostream.main.entities.User;
import com.iostream.main.repositories.UserRepository;

@SpringBootApplication
public class SpringBoootHibernateProgramApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoootHibernateProgramApplication.class, args);
    }

    @Override
    public void run(String... args) {
        User user = userRepository.findById(1L).orElse(null);

        if (user != null) {
            System.out.println("Name: " + user.getName());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Gender: " + user.getGender());
            System.out.println("City: " + user.getCity());
        } else {
            System.out.println("User with id=1 not found. Creating a new user...");

            User newUser = new User();
            newUser.setName("Alice");
            newUser.setEmail("alice@example.com");
            newUser.setGender("Female");
            newUser.setCity("New York");

            userRepository.save(newUser);

            System.out.println("New user created with id=" + newUser.getId());
        }
    }
}
