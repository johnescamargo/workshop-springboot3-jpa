package com.johnescamargo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnescamargo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
