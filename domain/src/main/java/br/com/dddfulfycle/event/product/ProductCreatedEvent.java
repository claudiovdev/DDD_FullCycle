package br.com.dddfulfycle.event.product;

import br.com.dddfulfycle.event.shared.EventInterface;

import java.util.Date;

public class ProductCreatedEvent implements EventInterface {
    private final Date dateTimeOccurred;
    private final Object eventData;

    public ProductCreatedEvent(Date dateTimeOccurred, Object eventData) {
        this.dateTimeOccurred = dateTimeOccurred;
        this.eventData = eventData;
    }

    @Override
    public Date getDateTimeOcurred() {
        return dateTimeOccurred;
    }

    @Override
    public Object getEventData() {
        return eventData;
    }
}
