package br.com.dddfulfycle.domain;

import br.com.dddfulfycle.domain.entity.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("1", "Vininicius");
        System.out.println(customer);
    }
}