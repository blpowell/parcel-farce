package uk.co.parcelfarce.events;

import uk.gov.dvla.osl.eventsourcing.api.Event;

import java.util.Date;
import java.util.UUID;

/**
 * Created by bp on 12/09/17.
 */
public class ParcelReturnedToDepot implements Event {

    private UUID parcelId;
    private Date dateReturnedToDepot;
    private String depotName;

    public UUID aggregateId() {
        return parcelId;
    }
}
