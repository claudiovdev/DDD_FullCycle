package br.com.dddfulfycle.domain;

import br.com.dddfulfycle.domain.entity.Address;
import br.com.dddfulfycle.domain.entity.Customer;
import br.com.dddfulfycle.domain.entity.Order;
import br.com.dddfulfycle.domain.entity.OrderItem;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("123", "Vinicius");
        Address address = new Address("Teste rua", 1,"23000-00","Rio de Janeiro");
        customer.setAddress(address);
        customer.activate();
        System.out.println(address);

        OrderItem item1 = new OrderItem("1","123", "Item 1", 100.00,1);
        OrderItem item2 = new OrderItem("1","123", "Item 2", 100.00,1);

        Order order = new Order("1", "123", Arrays.asList(item1, item2));

    }
}