package com.example.demomvcedoclass.service;

import com.example.demomvcedoclass.repository.ProductRepository;
import org.springframework.stereotype.Service;


@Service
public class AdminService {
    private final ProductRepository product;

    public AdminService(ProductRepository product) {
        this.product = product;
    }
}
