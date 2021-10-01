package com.demo.payment.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Merchant {

    @Id
    @GeneratedValue
    private long id;
    private String merchantId;
    private String merchantName;
    private String email;
    private String callbackUrl;
    private Currency baseCurrency;
    private double limitCount;
    private double limitDay;
    private double limitMonth;
    private int refundPeriod;
}
