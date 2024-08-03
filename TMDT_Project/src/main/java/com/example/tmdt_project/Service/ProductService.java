package com.example.tmdt_project.Service;

import com.example.tmdt_project.model.Entity.Product;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ProductService {
    Product addProduct(Product product);

    Product addProduct(MultipartFile[] images, Map<String, String> params) throws IOException;

    Product getById(Integer id);

    List<Product> filterByPrices(Long minPrice, Long maxPrice);
}
