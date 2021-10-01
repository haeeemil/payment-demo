package com.demo.payment.domain;

import lombok.Getter;

@Getter
public enum PayType {

    PAYMENT("1"),
    REFUND("2"),
    RECURRING("3"),
    CANCEL_RECURRING("4"),
    LOAN("5"),
    SEARCH("6");

    private final String value;

    PayType(String value) {
        this.value = value;
    }

    public static PayType getPayType(String str) {
        PayType payType = null;

        for (PayType _payType : PayType.values()) {
            if (_payType.getValue().equals(str)) {
                payType = _payType;
                break;
            }
        }

        if (payType == null) {
            throw new IllegalArgumentException("failed to convert PayType: " + str);
        }

        return payType;
    }

}
