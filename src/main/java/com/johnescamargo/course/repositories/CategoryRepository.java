package com.johnescamargo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnescamargo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
