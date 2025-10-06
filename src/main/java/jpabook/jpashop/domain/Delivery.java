package jpabook.jpashop.domain;

import jakarta.persistence.*;

public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long deliveryId;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status; // READY, COMP


}
