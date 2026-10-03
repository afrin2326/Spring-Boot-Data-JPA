package com.iostream.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iostream.main.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
