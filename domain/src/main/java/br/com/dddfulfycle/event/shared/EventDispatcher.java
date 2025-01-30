package br.com.dddfulfycle.event.shared;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventDispatcher implements EventDispatcherInterface{

    private Map<String,List<EventHandlerInterface<?>>> eventHandlers = new HashMap<>();
    @Override
    public void notify(EventInterface event) {

    }

    @Override
    public void register(String eventName, EventHandlerInterface eventHandler) {
        if (!eventHandlers.containsKey(eventName)){
            eventHandlers.put(eventName, new ArrayList<>());
        }
        eventHandlers.get(eventName).add(eventHandler);
    }

    @Override
    public void unRegister(String eventName, EventHandlerInterface eventHandler) {
        if (eventHandlers.get(eventName).contains(eventHandler)){
            eventHandlers.get(eventName).remove(eventHandler);
        }

    }

    @Override
    public void unRegisterAll() {
        eventHandlers.clear();

    }

    public Map<String, List<EventHandlerInterface<?>>> getEventHandlers(){
        return eventHandlers;
    }
}
