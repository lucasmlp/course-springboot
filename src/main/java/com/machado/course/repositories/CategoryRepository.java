package com.machado.course.repositories;

import com.machado.course.entities.Category;
import com.machado.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
