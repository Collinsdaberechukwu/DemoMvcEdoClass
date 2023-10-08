package com.example.demomvcedoclass.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String productName;
    private String description;
    private String productAmount;
    private String productQuantity;

    @CreationTimestamp
    private Date created;
    @UpdateTimestamp
    private Date updated;
}