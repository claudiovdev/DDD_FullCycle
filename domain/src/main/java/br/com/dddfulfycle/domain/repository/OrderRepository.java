package br.com.dddfulfycle.domain.repository;

import br.com.dddfulfycle.domain.entity.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository {

    void save(Order order);

    Order findById(String id);

    List<Order> findAll();
}
