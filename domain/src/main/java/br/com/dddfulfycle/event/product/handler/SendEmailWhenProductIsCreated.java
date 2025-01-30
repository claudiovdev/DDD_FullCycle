package br.com.dddfulfycle.event.product.handler;

import br.com.dddfulfycle.event.product.ProductCreatedEvent;
import br.com.dddfulfycle.event.shared.EventHandlerInterface;
import br.com.dddfulfycle.event.shared.EventInterface;

public class SendEmailWhenProductIsCreated implements EventHandlerInterface<ProductCreatedEvent> {

    @Override
    public void handle(ProductCreatedEvent event) {
        System.out.println("Sending email to .....");
    }

}

