package com.example.tmdt_project.Service.impl;

import com.example.tmdt_project.model.Entity.User;
import com.example.tmdt_project.model.MD5.MD5encriptor;
import com.example.tmdt_project.Repository.UserRepository;
import com.example.tmdt_project.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    public UserRepository userRepository;

    @Override
    public User addUser(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if (user!=null){
            String pass = user.getPassword();
            MD5encriptor md5 =  new MD5encriptor();
            String result = md5.encript(pass);
            user.setPassword(result);
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public User findByUsername(String name) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

}
