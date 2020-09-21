package com.talescorrea.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talescorrea.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
