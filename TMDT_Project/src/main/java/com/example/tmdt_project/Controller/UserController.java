package com.example.tmdt_project.Controller;

import com.example.tmdt_project.Model.Entity.User;
import com.example.tmdt_project.Model.MD5.MD5encriptor;
import com.example.tmdt_project.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
@RestController
@RequestMapping("/home")
public class UserController {
    @Autowired
    public UserService userService;
    @PostMapping("/Register")
    public User addUser(@RequestBody User user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return userService.addUser(user);
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) throws UnsupportedEncodingException, NoSuchAlgorithmException
    {
        User dbUser = userService.findByUserName(user.getUserName());
        String pass = user.getPassword();
//            tạo obj MD5criptor
        MD5encriptor md5 =  new MD5encriptor();
        if (dbUser != null && dbUser.getPassword().equals(md5.encript(user.getPassword()))) {
            return new ResponseEntity<>(dbUser,HttpStatus.OK) ;
        } else {
            return new ResponseEntity<>("dang nhap sai", HttpStatus.UNAUTHORIZED);
        }
    }

}
