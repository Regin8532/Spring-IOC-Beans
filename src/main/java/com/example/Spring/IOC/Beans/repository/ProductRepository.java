package com.example.Spring.IOC.Beans.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Spring.IOC.Beans.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(String category);
}
