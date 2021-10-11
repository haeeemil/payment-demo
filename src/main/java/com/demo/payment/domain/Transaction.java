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

    //카드 16자
    private String cardNumber1;
    private String cardNumber2;
    private String cardNumber3;
    private String cardNumber4;
    //카드 유효기간 월/년
    private String cardExpired1;
    private String cardExpired2;

    private String csv;
    private String cardHolder;
    private CardType cardType;
    private double amount;
    private double baseAmount;
    private PayState state;
    private String approvalNumber;
    private ErrorCode errorCode;
    private String connectIp;
    private String phoneNumber;
    private String Email;
    private LocalDateTime createdAt;
}
