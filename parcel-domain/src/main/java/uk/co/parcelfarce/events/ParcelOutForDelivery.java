package uk.co.parcelfarce.events;

import uk.gov.dvla.osl.eventsourcing.api.Event;

import java.util.Date;
import java.util.UUID;

public class ParcelOutForDelivery implements Event {

    private UUID parcelId;
    private Date outForDeliveryDate;
    private String driverName;

    public UUID aggregateId() {
        return parcelId;
    }
}
