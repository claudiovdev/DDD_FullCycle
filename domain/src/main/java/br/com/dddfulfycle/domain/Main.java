package br.com.dddfulfycle.domain;

import br.com.dddfulfycle.domain.entity.Address;
import br.com.dddfulfycle.domain.entity.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("1", "Vininicius");
        Address address = new Address("Teste rua", 1,"23000-00","Rio de Janeiro");
        customer.setAddress(address);
        customer.activate();
        System.out.println(address);
    }
}