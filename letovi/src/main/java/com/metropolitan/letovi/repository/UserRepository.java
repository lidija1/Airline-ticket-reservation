package com.metropolitan.letovi.repository;

import com.metropolitan.letovi.entiteti.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByUsername(String username);
}


