package com.demo.payment.controller.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class PaymentRequest {

    @NotEmpty(message = "카드번호는 필수 입니다")
    public String cardNumber1;
    public String cardNumber2;
    public String cardNumber3;
    public String cardNumber4;

    public String cardExpired1;
    public String cardExpired2;

}
