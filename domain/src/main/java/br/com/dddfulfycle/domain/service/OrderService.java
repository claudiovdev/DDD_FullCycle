package br.com.dddfulfycle.domain.service;

import br.com.dddfulfycle.domain.entity.Order;

import java.util.List;

public class OrderService {
    public Double getTotalDoPedido(List<Order> orders) {
        return orders.stream().map(Order::total).reduce(0.0, Double::sum);
    }
}
