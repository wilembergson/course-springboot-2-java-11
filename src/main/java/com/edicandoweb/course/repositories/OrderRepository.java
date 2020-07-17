package com.edicandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edicandoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
