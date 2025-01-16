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
    void deveLancarErroQuandoCustumerIdEstiverVazio(){
        RuntimeException exception = assertThrows(RuntimeException.class, ()-> {
            Order order = new Order("1","", new ArrayList<>());
        });

        assertEquals("CustumerId is required", exception.getMessage());
    }

    @Test
    void deveLancarErroQuandoItensEstiverVazio(){
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
           Order order = new Order("1", "123", new ArrayList<>());
        });
        assertEquals("Itens is required", exception.getMessage());
    }

    @Test
    void deveCalcularTotal(){
        OrderItem item1 = new OrderItem("i1","cama",100.00);
        OrderItem item2 = new OrderItem("i2", "mesa", 200.00);
        Order order = new Order("01","123", Arrays.asList(item1,item2));

        var total = order.total();

        assertEquals(300.00, total);
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

}