package uk.co.parcelfarce.events;

import uk.co.parcelfarce.domain.Address;
import uk.co.parcelfarce.domain.Priority;
import uk.gov.dvla.osl.eventsourcing.api.Event;

import java.util.Date;
import java.util.UUID;


public class ParcelReceived implements Event {

    private UUID parcelId;
    private Date dateReceived;

    private Address rerecipientAddress;
    private String recipientName;

    private Address senderAddress;
    private String  senderName;

    private double weightInKg;
    private Priority deliveryPriority;

    public UUID aggregateId() {
        return parcelId;
    }
}
