package br.com.dddfulfycle.infrastructure.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerModel {
    @Id
    private String id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private Integer number;
    @Column(nullable = false)
    private String zip;

    private String city;
    @Column(nullable = false)
    private boolean active;
    @Column(nullable = false)
    private Double rewards;

    public CustomerModel(String id, String name, String street, Integer number, String zip,String city,boolean active, Double rewards) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.number = number;
        this.zip = zip;
        this.active = active;
        this.rewards = rewards;
        this.city = city;
    }

    public CustomerModel() {
    }
}
