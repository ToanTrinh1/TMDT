package com.example.tmdt_project.Repository;

import com.example.tmdt_project.Model.DTO.UserDTO;
import com.example.tmdt_project.Model.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String name);
}
