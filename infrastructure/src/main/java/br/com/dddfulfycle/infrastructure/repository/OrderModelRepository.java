package br.com.dddfulfycle.infrastructure.repository;

import br.com.dddfulfycle.infrastructure.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderModelRepository extends JpaRepository<OrderModel, String> {
}
