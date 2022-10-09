package com.johnescamargo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnescamargo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
