package com.demo.payment.domain;

public enum ErrorCode {

    DANGER_701("701", "도난 카드"),
    SYSTEM("999", "시스템 에러");

    private String code;
    private String description;

    ErrorCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }
}
