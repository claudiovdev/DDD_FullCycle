package br.com.dddfulfycle.domain.repository;

import br.com.dddfulfycle.domain.entity.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository{
    void save(Product product);
    Product findById(String id);

    List<Product> findAll();

}
