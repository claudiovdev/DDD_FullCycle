package br.com.dddfulfycle.infrastructure.repository;

import br.com.dddfulfycle.infrastructure.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerModelRepository extends JpaRepository<CustomerModel, String> {

}
