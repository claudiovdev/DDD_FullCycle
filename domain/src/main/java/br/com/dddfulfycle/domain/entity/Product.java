package br.com.dddfulfycle.domain.entity;

public class Product {
    private String id;
    private String nome;
    private Double price;

    public Product(String id, String nome, Double price) {
        this.id = id;
        this.nome = nome;
        this.price = price;
    }

    private void validate(){

    }
}
