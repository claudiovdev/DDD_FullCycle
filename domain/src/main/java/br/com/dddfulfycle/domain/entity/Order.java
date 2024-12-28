package br.com.dddfulfycle.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private String customerId;
    private List<OrderItem> items = new ArrayList<>();

    public Order(String id, String customerId, List<OrderItem> items) {
        this.id = id;
        this.customerId = customerId;
        this.items = items;
    }



}
