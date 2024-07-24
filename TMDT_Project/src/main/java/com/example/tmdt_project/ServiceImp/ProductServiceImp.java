package com.example.tmdt_project.ServiceImp;

import com.example.tmdt_project.Model.Entity.Product;
import com.example.tmdt_project.Repository.ProductRepository;
import com.example.tmdt_project.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    public ProductRepository productRepository;
    @Override
    public Product addProduct(Product product) {
        if (product!=null){
            return productRepository.save(product);
        }
        return null;
    }
}
