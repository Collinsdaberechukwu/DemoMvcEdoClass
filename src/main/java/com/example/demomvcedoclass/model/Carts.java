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
@Table(name = "carts")
public class Carts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_name_id")
    private Products productName;

    @ManyToOne
    @JoinColumn(name = "product_amount_id")
    private Products productAmount;

    @ManyToOne
    @JoinColumn(name = "product_quantity_id")
    private Products productQuantity;

    @CreationTimestamp
    private Date created;
    @UpdateTimestamp
    private Date updated;

}