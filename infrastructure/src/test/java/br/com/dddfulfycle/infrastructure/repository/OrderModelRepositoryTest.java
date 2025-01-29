package br.com.dddfulfycle.infrastructure.repository;

import br.com.dddfulfycle.domain.entity.*;
import br.com.dddfulfycle.domain.repository.CustomerRepository;
import br.com.dddfulfycle.domain.repository.OrderRepository;
import br.com.dddfulfycle.domain.repository.ProductRepository;
import br.com.dddfulfycle.infrastructure.repository.impl.CustomerRepositoryImpl;
import br.com.dddfulfycle.infrastructure.repository.impl.OrderModelRepositoryImpl;
import br.com.dddfulfycle.infrastructure.repository.impl.ProductRepositoryImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Import({OrderModelRepositoryImpl.class, CustomerRepositoryImpl.class, ProductRepositoryImpl.class})
class OrderModelRepositoryTest {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @Test
    void shouldCreateOrder() {
        // Criando cliente
        Customer customer = new Customer("6", "Gabriela Melo");
        Address address = new Address("Avenida Paulista", 123, "01310-000", "São Paulo");
        customer.setAddress(address);
        customer.activate();
        customer.addRewards(100.00);
        customerRepository.save(customer);

        // Criando produto
        Product product = new Product("123", "Camisa", 50.00);
        productRepository.save(product);

        // Criando item do pedido
        OrderItem orderItem = new OrderItem("123", product.getId(),product.getName(), product.getPrice(), 2);

        // Criando pedido
        Order order = new Order("123", customer.getId(), Arrays.asList(orderItem));
        orderRepository.save(order);

        var resultado = orderRepository.findById("123");

        assertNotNull(resultado);

    }
}

