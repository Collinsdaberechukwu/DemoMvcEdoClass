package com.example.demomvcedoclass.repository;

import com.example.demomvcedoclass.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products,Long> {
}
