package com.demo.payment.controller.dto;

import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Getter
public class RecurringRequest {

    @NotEmpty(message = "카드번호는 필수 입니다")
    @Pattern(regexp="[0-9]", message = "카드번호는숫자만 입력해 주십시오")
    public String cardNumber1;

    @NotEmpty(message = "카드번호는 필수 입니다")
    @Pattern(regexp="[0-9]", message = "카드번호는 숫자만 입력해 주십시오")
    public String cardNumber2;

    @NotEmpty(message = "카드번호는 필수 입니다")
    @Pattern(regexp="[0-9]", message = "카드번호는 숫자만 입력해 주십시오")
    public String cardNumber3;

    @NotEmpty(message = "카드번호는 필수 입니다")
    @Pattern(regexp="[0-9]", message = "카드번호는 숫자만 입력해 주십시오")
    public String cardNumber4;

    @NotEmpty(message = "유효기한은 필수 입니다")
    @Pattern(regexp="[0-9]", message = "유효기한은 숫자만 입력해 주십시오")
    public String expiredMonth;

    @NotEmpty(message = "유효기한은 필수 입니다")
    @Pattern(regexp="[0-9]", message = "유효기한은 숫자만 입력해 주십시오")
    public String expiredYear;

    @NotEmpty(message = "보안코드는 필수 입니다")
    @Pattern(regexp="[0-9]", message = "보안코드는 숫자만 입력해 주십시오")
    public String cvs;

    @NotEmpty(message = "카드소유주는 필수 입니다")
    @Pattern(regexp="[a-zA-Z]", message = "카드소유주는 알파벳만 입력해 주십시오")
    public String cardHolder;

    @Pattern(regexp="[0-9]", message = "전화번호는 숫자만 입력해 주십시오")
    public String phoneNumber;

    @Email(message = "이메일 형식을 확인해 주십시오")
    public String email;
}
