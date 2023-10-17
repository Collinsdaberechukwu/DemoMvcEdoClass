package com.example.demomvcedoclass.service;

import com.example.demomvcedoclass.dto.ProductsDto;
import com.example.demomvcedoclass.model.Products;
import com.example.demomvcedoclass.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class AdminService {
    private final ProductRepository product;

    public ResponseEntity<Products> createProduct(ProductsDto product){
        Products newProduct = new Products();
        newProduct.setProductName(product.getProductName());
        newProduct.setdescription(product.getdescription());
    }
}
