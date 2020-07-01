package com.edicandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edicandoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
