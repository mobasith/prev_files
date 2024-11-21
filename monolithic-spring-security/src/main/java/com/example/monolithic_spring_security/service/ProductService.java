package com.example.monolithic_spring_security.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.monolithic_spring_security.dao.ProductRepository;
import com.example.monolithic_spring_security.entity.Product;

@Service
public class ProductService {
    @Autowired
    ProductRepository repo;

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product getAProduct(int prodId) {
        Optional<Product> po = repo.findById(prodId);
        if (po.isPresent()) {
            return po.get();
        } else {
            return null;
        }

    }

    public Product addProduct(Product newprod) {
        repo.saveAndFlush(newprod);
        return newprod;
    }

}
