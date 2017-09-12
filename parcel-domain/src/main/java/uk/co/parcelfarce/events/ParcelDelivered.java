package uk.co.parcelfarce.events;


import uk.gov.dvla.osl.eventsourcing.api.Event;

import java.util.Date;
import java.util.UUID;

public class ParcelDelivered implements Event {

    private UUID parcelId;
    private Date dateDelivered;
    private String signaureSurname;

    public UUID aggregateId() {
        return parcelId;
    }
}
