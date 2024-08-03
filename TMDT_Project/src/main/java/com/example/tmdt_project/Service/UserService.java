package com.example.tmdt_project.Service;

import com.example.tmdt_project.model.Entity.User;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface UserService {
    User addUser(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException;
    User findByUsername(String name);
    User updateUser(User user);
}
