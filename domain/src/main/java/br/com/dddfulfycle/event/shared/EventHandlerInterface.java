package br.com.dddfulfycle.event.shared;

public interface EventHandlerInterface<T extends EventInterface> {
    void handle(T event);
}
