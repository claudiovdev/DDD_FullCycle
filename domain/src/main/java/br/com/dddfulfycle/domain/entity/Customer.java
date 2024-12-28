package br.com.dddfulfycle.domain.entity;

public class Customer {
    private String id;
    private String name;
    private String address;

    private boolean active;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
        validate();
    }

    private void validate(){
        if(this.id == null || id.isBlank()){
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

    public void actiavte(){
        if (this.address == null || this.address.isBlank()){
            throw new RuntimeException("Address is mandatory to activate a customer");
        }
        this.active = true;
    }

    public void deactivate(){
        this.active = false;
    }
}
