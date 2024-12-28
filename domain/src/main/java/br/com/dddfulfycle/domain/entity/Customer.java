package br.com.dddfulfycle.domain.entity;

public class Customer {
    private String id;
    private String name;
    private Address address;

    private boolean active;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
        validate();
    }

    private void validate(){
        if(this.id == null || this.id.isBlank()){
            throw new RuntimeException("Id is required");
        }
        if (this.name == null || this.name.isBlank()){
            throw new RuntimeException("Name is required");
        }
    }

    public void changeName(String name){
        this.name  = name;
        validate();
    }

    public void activate(){
        if (this.address == null){
            throw new RuntimeException("Address is mandatory to activate a customer");
        }
        this.active = true;
    }

    public void deactivate(){
        this.active = false;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
