package br.com.dddfulfycle.infrastructure.repository.impl;

import br.com.dddfulfycle.domain.entity.Product;
import br.com.dddfulfycle.domain.repository.ProductRepository;
import br.com.dddfulfycle.infrastructure.model.ProductModel;
import br.com.dddfulfycle.infrastructure.repository.ProductModelRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductModelRepository productJpaRepository;

    public ProductRepositoryImpl(ProductModelRepository productJpaRepository) {
        this.productJpaRepository = productJpaRepository;
    }

    @Override
    public void save(Product product) {
        productJpaRepository.save(new ProductModel(product.getId(), product.getName(), product.getPrice()));
    }

    @Override
    public Optional<Product> findById(String id) {
        var productModel =  productJpaRepository.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
        Product product = new Product(productModel.getId(), productModel.getNome(),productModel.getPrice());
        return Optional.of(product);
    }
}
