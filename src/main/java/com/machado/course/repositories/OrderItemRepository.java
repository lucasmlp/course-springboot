package com.machado.course.repositories;

import com.machado.course.entities.OrderItem;
import com.machado.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
