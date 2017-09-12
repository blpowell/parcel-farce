package uk.co.parcelfarce.domain;

import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class Parcel {

    private String recipientName;
    private Address recipientAddress;

    private String senderName;
    private Address senderAddress;

    private double weightInKg;
    private Priority deliveryPriority;

}
