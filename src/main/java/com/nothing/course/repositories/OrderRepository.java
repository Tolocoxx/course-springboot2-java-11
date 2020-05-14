package com.nothing.course.repositories;

import com.nothing.course.entities.Order;
import com.nothing.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
