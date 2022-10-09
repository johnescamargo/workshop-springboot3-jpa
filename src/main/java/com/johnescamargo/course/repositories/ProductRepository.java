package com.johnescamargo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnescamargo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
