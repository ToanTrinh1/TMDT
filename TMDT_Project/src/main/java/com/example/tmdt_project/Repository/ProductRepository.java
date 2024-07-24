package com.example.tmdt_project.Repository;

import com.example.tmdt_project.Model.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product , Integer> {
}
