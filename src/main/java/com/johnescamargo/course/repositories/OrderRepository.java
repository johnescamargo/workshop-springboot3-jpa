package com.johnescamargo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnescamargo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
