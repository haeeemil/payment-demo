package com.demo.payment.controller.dto;

import javax.validation.constraints.NotEmpty;

public class PaymentRequest {

    @NotEmpty(message = "카드번호는 필수 입니다")
    public int cardNumber1;
    public int cardNumber2;
    public int cardNumber3;
    public int cardNumber4;

}
