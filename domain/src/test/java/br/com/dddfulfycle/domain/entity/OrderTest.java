package br.com.dddfulfycle.domain.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void deveLancarErroQuandoIdEstiverVazio(){
        RuntimeException exception = assertThrows(RuntimeException.class, ()-> {
            Order order = new Order("","123", new ArrayList<>());
        });

        assertEquals("Id is required", exception.getMessage());
    }

    @Test
    void deveLancarErroQuandoCustmerIdEstiverVario(){
        RuntimeException exception = assertThrows(RuntimeException.class, ()->{
            Order order = new Order("123", "", new ArrayList<>());
        });

        assertEquals("customerId is required", exception.getMessage());
    }

    @Test
    void deveLancarErroQuandoItemsForIgualOuMenorQueZero(){
        RuntimeException exception = assertThrows(RuntimeException.class, ()->{
            Order order = new Order("123", "123", new ArrayList<>());
        });

        assertEquals("Items are required", exception.getMessage());
    }

    @Test
    void deveCalcularTotal(){

        var item1 = new OrderItem("1", "Item 1", 100.00);
        var item2 = new OrderItem("2", "Item 2", 200.00);

        Order order = new Order("123", "123", Arrays.asList(item1,item2));

        assertEquals(300.00, order.total());


    }
}