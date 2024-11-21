package com.example.monolithic_spring_security.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "product_details")
public class Product {
    @Id
    @Column(name = "prod_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int prodId;
    private String prodName;

}
