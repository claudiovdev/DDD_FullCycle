package br.com.dddfulfycle.domain.service;

import br.com.dddfulfycle.domain.entity.Product;

import java.util.List;

public class ProductService {
    public void increasePrice(List<Product> produtos, int percentage) {
        produtos.forEach( product -> {
            product.changePrice((product.getPrice() * percentage)/ 100 + product.getPrice());
        });
    }
}
