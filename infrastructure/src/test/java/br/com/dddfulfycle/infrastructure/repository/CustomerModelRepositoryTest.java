package br.com.dddfulfycle.infrastructure.repository;

import br.com.dddfulfycle.domain.entity.Address;
import br.com.dddfulfycle.domain.entity.Customer;
import br.com.dddfulfycle.domain.repository.CustomerRepository;
import br.com.dddfulfycle.infrastructure.model.CustomerModel;
import br.com.dddfulfycle.infrastructure.repository.impl.CustomerRepositoryImpl;
import br.com.dddfulfycle.infrastructure.repository.impl.ProductRepositoryImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Import(CustomerRepositoryImpl.class)
class CustomerModelRepositoryTest {

    @Autowired
    CustomerRepository repository;

    @Autowired
    CustomerModelRepository modelRepository;

    @Test
    void shouldCreateCustomer(){
        Customer customer = new Customer("6", "Gabriela Melo");
        Address address = new Address("Avenida Paulista", 123, "01310-000", "São Paulo");
        customer.setAddress(address);
        customer.activate();
        customer.addRewards(100.00);

        repository.save(customer);

        var customerFound = modelRepository.findById("6");


        assertNotNull(customerFound);
    }

}