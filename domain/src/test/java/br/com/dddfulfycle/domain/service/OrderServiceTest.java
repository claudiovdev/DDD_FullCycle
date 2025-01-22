package br.com.dddfulfycle.domain.service;

import br.com.dddfulfycle.domain.entity.Order;
import br.com.dddfulfycle.domain.entity.OrderItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class OrderServiceTest {

    private OrderService orderService;

    @BeforeEach
    void setup(){
        orderService = new OrderService();
    }


    @Test
    void deveRetornarOTotalDeOrders(){
        var orderItem1 = new OrderItem("i1", "123","Item 1", 100.00, 1 );
        var orderItem2 = new OrderItem("i2", "123","Item 1", 200.00, 2 );

        var order = new Order("1", "1", Arrays.asList(orderItem1));
        var order2 = new Order("2", "1", Arrays.asList(orderItem2));

        List<Order> orders = new ArrayList<>();
        orders.add(order);
        orders.add(order2);

        Double total = orderService.getTotalDoPedido(orders);

        assertEquals(500.00, total);
    }


}