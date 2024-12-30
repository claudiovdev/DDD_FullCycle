package br.com.dddfulfycle.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private String customerId;
    private List<OrderItem> items = new ArrayList<>();
    private Double total;

    public Order(String id, String customerId, List<OrderItem> items) {
        this.id = id;
        this.customerId = customerId;
        this.items = items;
        this.total = total();
        validate();
    }

    private void validate(){
        if (this.id == null || this.id.isBlank()){
            throw new RuntimeException("Id is required");
        }
    }


    public Double total(){
        return this.items.stream().map(OrderItem::getPrice).reduce(0.0, Double::sum);
    }

}
