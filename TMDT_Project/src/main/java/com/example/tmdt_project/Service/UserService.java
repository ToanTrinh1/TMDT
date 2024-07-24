package com.example.tmdt_project.Service;

import com.example.tmdt_project.Model.DTO.UserDTO;
import com.example.tmdt_project.Model.Entity.User;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface UserService {
    public User addUser(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException;
    public User findByUserName(String name);
    public User updateUser(User user);
}
