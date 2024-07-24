package com.example.tmdt_project.Controller;

import com.example.tmdt_project.Model.Entity.Product;
import com.example.tmdt_project.Model.Entity.User;
import com.example.tmdt_project.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/Product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

}
