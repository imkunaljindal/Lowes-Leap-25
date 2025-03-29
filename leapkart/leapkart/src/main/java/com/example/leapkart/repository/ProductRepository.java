package com.example.leapkart.repository;

import com.example.leapkart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
