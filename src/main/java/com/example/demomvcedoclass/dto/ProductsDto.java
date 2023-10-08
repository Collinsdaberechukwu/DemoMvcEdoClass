package com.example.demomvcedoclass.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductsDto {
    private String productName;
    private String description;
    private String productAmount;
}
