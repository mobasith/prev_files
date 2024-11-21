package com.example.monolithic_spring_security.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.monolithic_spring_security.entity.Product;
import com.example.monolithic_spring_security.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService service;

    @PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping("")
    public List<Product> getAll() {
        return service.getAll();
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/{prodId}")
    public Product getAProduct(@PathVariable("prodId") int prodId) {
        return service.getAProduct(prodId);

    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping("")
    public Product addProduct(@RequestBody Product newprod) {
        return service.addProduct(newprod);
    }

}
