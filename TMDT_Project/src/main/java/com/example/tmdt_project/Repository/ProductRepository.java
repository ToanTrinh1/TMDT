package com.example.tmdt_project.Repository;

import com.example.tmdt_project.model.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product , Integer> {

    @Query(value = "SELECT * FROM Product WHERE price > :minPrice AND price < maxPrice")
    List<Product> findByPrice(Long minPrice, Long maxPrice);
}
