package com.demo.payment.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Getter @Setter
public class Transaction {

    @Id @GeneratedValue
    @Column(name = "transaction_id")
    private Long id;
    private PayType type;
    private int cardNumber;
    private int cardExpired;
    private int csv;
    private String cardHolder;
    private CardType cardType;
    private double amount;
    private double baseAmount;
    private PayState state;
    private String approvalNumber;
    private ErrorCode errorCode;
    private String connectIp;
    private int phoneNumber;
    private String Email;
    private LocalDateTime createdAt;
}
