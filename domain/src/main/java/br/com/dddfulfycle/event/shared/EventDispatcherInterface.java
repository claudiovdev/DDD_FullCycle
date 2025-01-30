package br.com.dddfulfycle.event.shared;

public interface EventDispatcherInterface {

    void notify(EventInterface event);
    void register(String eventName, EventHandlerInterface eventHandler);
    void unRegister(String eventName, EventHandlerInterface eventHandler);

    void unRegisterAll();
}
