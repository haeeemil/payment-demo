package com.demo.payment.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Merchant {

    @Id @GeneratedValue
    @Column(name = "merchant_id")
    private Long id;
    private String merchantName;
    private String groupId;
    @Enumerated(EnumType.STRING)
    private State state;
    @Enumerated(EnumType.STRING)
    private Currency baseCurrency;
    private String email;
    private String tel;
    private String callbackUrl;
    private String billingName;
    private String product;
    private double limitCount;
    private double limitDay;
    private double limitMonth;
    private int refundPeriod;
    private NotifyType notifyType;
    private String settleHolding;
    private String settleCycle;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

}
