package com.example.demomvcedoclass.dto;

import com.example.demomvcedoclass.model.Products;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartDto {
    private List<ProductsDto> response;
    private Products productName;
    private Products productAmount;
    private Products productQuantity;

}
