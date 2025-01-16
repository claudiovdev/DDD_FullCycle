package br.com.dddfulfycle.domain.entity;

public class Produtct {
    private String id;
    private String name;
    private Double price;

    public Produtct(String id, String nome, Double price) {
        this.id = id;
        this.name = nome;
        this.price = price;
        this.validate();
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    private void validate() {
        if(this.id == null || this.id.isBlank()){
            throw new RuntimeException("Id is required");
        }

        if (this.name == null || this.name.isBlank()){
            throw new RuntimeException("Name is required");
        }

        if(this.price < 0){
            throw new RuntimeException("Price must be greater than zero");
        }
    }

    public void changeName(String name) {
        this.name = name;
        validate();
    }

    public void changePrice(double price) {
        this.price = price;
        validate();
    }
}
