package br.com.dddfulfycle.domain.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void deveLancarErroQuandoIdEstiverVazio(){
        RuntimeException exception = assertThrows(RuntimeException.class, ()-> {
            Order order = new Order("","123", new ArrayList<>());
        });

        assertEquals("Id is required", exception.getMessage());
    }

}