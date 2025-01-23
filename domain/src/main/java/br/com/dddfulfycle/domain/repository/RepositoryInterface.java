package br.com.dddfulfycle.domain.repository;

import java.util.List;

public interface RepositoryInterface<T> {
    void create(T entidade);
    void update(T entidade);
    T find(String id);
    List<T> findAll();
}
