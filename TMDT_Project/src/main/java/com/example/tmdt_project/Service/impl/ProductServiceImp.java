package com.example.tmdt_project.Service.impl;

import com.example.tmdt_project.model.Entity.Product;
import com.example.tmdt_project.model.Entity.ProductImage;
import com.example.tmdt_project.Repository.ProductImageRepository;
import com.example.tmdt_project.Repository.ProductRepository;
import com.example.tmdt_project.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductImageRepository productImageRepository;

    @Override
    public Product addProduct(Product product) {
        if (product != null) {
            return productRepository.save(product);
        }
        return null;
    }

    @Override
    public Product addProduct(MultipartFile[] images, Map<String, String> params) throws IOException {

        final String path = "C:\\Users\\teocaothu\\Desktop\\Project_sanTMDT\\TMDT_Project\\src\\main\\resources\\upload\\";

        Product newProd = new Product();

        String title = params.get("title");
        String price = params.get("price");
        String description = params.get("description");

        newProd.setTitle(title);
        newProd.setPrice(Long.parseLong(price));
        newProd.setDescription(description);

        productRepository.save(newProd);

        List<ProductImage> listImages = new ArrayList<>();
        for (MultipartFile productImage : images) {
            ProductImage newImage = new ProductImage();
            // lưu vật lí
            String pathImg = path + productImage.getOriginalFilename();
            productImage.transferTo(new File(pathImg));

            newImage.setName(productImage.getOriginalFilename());
            newImage.setLink(pathImg);
            newImage.setProduct(newProd);

            listImages.add(newImage);
            productImageRepository.save(newImage);
        }
        newProd.setImages(listImages);


        return newProd;

    }

    @Override
    public Product getById(Integer id) {
        return productRepository.findById(id)
                .get();
    }

    @Override
    public List<Product> filterByPrices(Long minPrice, Long maxPrice) {
        return productRepository.findByPrice(minPrice, maxPrice);
    }
}
