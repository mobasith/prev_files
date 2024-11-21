package com.example.monolithic_spring_security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.monolithic_spring_security.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
