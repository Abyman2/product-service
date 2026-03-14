package com.ctbe.abelandafomia.service;

import com.ctbe.abelandafomia.model.Product;
import com.ctbe.abelandafomia.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    // Constructor Injection
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Get all products
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    // Get product by ID
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    // Save product
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
