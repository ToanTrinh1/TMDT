package com.example.tmdt_project.controller;

import com.example.tmdt_project.model.Entity.Product;
import com.example.tmdt_project.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public Product addProduct(@RequestParam MultipartFile[] images,
                              @RequestParam Map<String, String> params) throws IOException {

        return productService.addProduct(images, params);
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) {
        return productService.getById(id);
    }

}
