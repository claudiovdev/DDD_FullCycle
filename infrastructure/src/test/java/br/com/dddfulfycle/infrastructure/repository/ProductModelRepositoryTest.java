package br.com.dddfulfycle.infrastructure.repository;

import br.com.dddfulfycle.domain.entity.Product;
import br.com.dddfulfycle.domain.repository.ProductRepository;
import br.com.dddfulfycle.infrastructure.model.ProductModel;
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
    void createProduct(){
        Product productModel = new Product("123","casa",100.00);

        productRepository.save(productModel);

        Optional<Product> product = productRepository.findById("123");

        assertEquals("123", product.get().getId());
    }

}