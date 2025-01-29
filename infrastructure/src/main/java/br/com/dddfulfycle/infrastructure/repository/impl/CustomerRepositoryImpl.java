package br.com.dddfulfycle.infrastructure.repository.impl;

import br.com.dddfulfycle.domain.entity.Customer;
import br.com.dddfulfycle.domain.repository.CustomerRepository;
import br.com.dddfulfycle.infrastructure.model.CustomerModel;
import br.com.dddfulfycle.infrastructure.repository.CustomerModelRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerRepositoryImpl implements CustomerRepository {


    private final CustomerModelRepository repository;

    public CustomerRepositoryImpl(CustomerModelRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Customer customer) {
        repository.save(new CustomerModel(customer.getId(), customer.getName(),
                customer.getAddress().getStreet(),customer.getAddress().getNumber(),
                customer.getAddress().getZip(),customer.getAddress().getCity(),customer.getActive(), customer.getRewards()));
    }

    @Override
    public Customer findById(String id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }
}
