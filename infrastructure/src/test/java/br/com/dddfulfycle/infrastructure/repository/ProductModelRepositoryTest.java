package br.com.dddfulfycle.infrastructure.repository;

import br.com.dddfulfycle.domain.entity.Product;
import br.com.dddfulfycle.domain.repository.ProductRepository;
import br.com.dddfulfycle.infrastructure.repository.impl.ProductRepositoryImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Import(ProductRepositoryImpl.class)
class ProductModelRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @Test
    void shouldCreateProduct(){
        Product productModel = new Product("123","casa",100.00);

        productRepository.save(productModel);

        Product product = productRepository.findById("123");

        assertEquals("123", product.getId());
    }

    @Test
    void shouldFindAllProducts(){
        Product productModel1 = new Product("123","casa",100.00);
        Product productModel2 = new Product("1234","Jardim",100.00);

        productRepository.save(productModel1);
        productRepository.save(productModel2);

        var products = productRepository.findAll();

        assertEquals(2, products.size());
    }

}