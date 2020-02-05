package com.machado.course.repositories;

import com.machado.course.entities.Category;
import com.machado.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
