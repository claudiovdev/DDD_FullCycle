package br.com.dddfulfycle.infrastructure.repository;

import br.com.dddfulfycle.infrastructure.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductModelRepository extends JpaRepository<ProductModel,String> {
}
