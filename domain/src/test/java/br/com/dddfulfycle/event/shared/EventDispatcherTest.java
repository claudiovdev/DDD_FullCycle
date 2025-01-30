package br.com.dddfulfycle.event.shared;

import br.com.dddfulfycle.event.product.handler.SendEmailWhenProductIsCreated;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventDispatcherTest {

    EventDispatcher eventDispatcher = new EventDispatcher();

    @Test
    void shoulRegisterAnEventHandler(){
        var eventHandler = new SendEmailWhenProductIsCreated();

        eventDispatcher.register("PruductCreatedEvent", eventHandler);

        var resultado = eventDispatcher.getEventHandlers();

        assertNotNull(resultado.get("PruductCreatedEvent"));
    }

    @Test
    void shouldUnregisterAnEventHandler(){
        var eventHandler = new SendEmailWhenProductIsCreated();

        eventDispatcher.register("PruductCreatedEvent", eventHandler);

        var resultado = eventDispatcher.getEventHandlers();

        assertNotNull(resultado.get("PruductCreatedEvent"));

        eventDispatcher.unRegister("PruductCreatedEvent", eventHandler);

        assertEquals(0,resultado.get("PruductCreatedEvent").size());

    }

    @Test
    void shouldUnregisterAll(){
        var eventHandler = new SendEmailWhenProductIsCreated();

        eventDispatcher.register("PruductCreatedEvent", eventHandler);

        var resultado = eventDispatcher.getEventHandlers();

        assertNotNull(resultado.get("PruductCreatedEvent"));

        eventDispatcher.unRegisterAll();

        assertEquals(0,resultado.size());
    }

}