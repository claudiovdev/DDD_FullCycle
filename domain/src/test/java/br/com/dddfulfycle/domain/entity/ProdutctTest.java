package br.com.dddfulfycle.domain.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutctTest {

    @Test
    void deveLancarErroQuandoIdEstiverVazio(){
        RuntimeException exception = assertThrows(RuntimeException.class, ()->{
            var produtct = new Produtct("", "Product 1", 100.00);
        });

        assertEquals("Id is required", exception.getMessage());
    }

    @Test
    void deveLancarErroQuandoNomeEstiverVazio(){
        RuntimeException exception = assertThrows(RuntimeException.class, ()->{
            var produtct = new Produtct("123", "", 100.00);
        });

        assertEquals("Name is required", exception.getMessage());
    }

    @Test
    void deveLancarErroQuandoPrecoForMenorQueZero(){
        RuntimeException exception = assertThrows(RuntimeException.class, ()->{
            var produtct = new Produtct("123", "Product 1", -1.0);
        });

        assertEquals("Price must be greater than zero", exception.getMessage());
    }

    @Test
    void deveTrocarNomeDoProduto(){
        var produtct = new Produtct("123", "Product 1", 10.00);

        produtct.changeName("Product 2");

        assertEquals("Product 2", produtct.getName());
    }

    @Test
    void deveTrocarPrecoDoProduto(){
        var produtct = new Produtct("123", "Product 1", 10.00);

        produtct.changePrice(20.00);

        assertEquals(20.00, produtct.getPrice());
    }

}