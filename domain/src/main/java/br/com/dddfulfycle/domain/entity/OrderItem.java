package br.com.dddfulfycle.domain.entity;

public class OrderItem {
    private String id;
    private String nome;
    private Double price;

    public OrderItem(String id, String nome, Double price) {
        this.id = id;
        this.nome = nome;
        this.price = price;
    }
}
