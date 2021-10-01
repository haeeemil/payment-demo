package com.demo.payment.exception;

public class MerchantNotFoundException extends RuntimeException {

    public MerchantNotFoundException() {
        super();
    }

    public MerchantNotFoundException(String message) {
        super(message);
    }

    public MerchantNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public MerchantNotFoundException(Throwable cause) {
        super(cause);
    }
}
