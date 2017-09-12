package uk.co.parcelfarce.events;

import uk.gov.dvla.osl.eventsourcing.api.Event;

import java.util.Date;
import java.util.UUID;

public class ParcelMoved implements Event {

    private UUID parcelId;
    private Date dateOfMovement;
    private String location;

    public UUID aggregateId() {
        return parcelId;
    }
}
