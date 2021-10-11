package com.demo.payment.controller.dto;

import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@Getter
public class RecurringRequest {

    @NotEmpty(message = "카드번호1 필수 입니다")
    public String cardNumber1;
    @NotEmpty(message = "카드번호2 필수 입니다")
    public String cardNumber2;
    @NotEmpty(message = "카드번호3 필수 입니다")
    public String cardNumber3;
    @NotEmpty(message = "카드번호4 필수 입니다")
    public String cardNumber4;
}
