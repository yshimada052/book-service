package com.skillstorm.bookservice.data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.skillstorm.bookservice.models.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}