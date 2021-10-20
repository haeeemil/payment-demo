package com.demo.payment.controller.dto;

import java.util.HashMap;
import java.util.Map;

public class PaymentResponse {

    private String fieldName;
    private String className;
    private String resultMessage;

    public static Map<String, String> getMap (String fieldName, String className, String resultMessage) {
        Map<String, String> result = new HashMap<>();
        result.put("fieldName", fieldName);
        result.put("className", className);
        result.put("resultMessage", resultMessage);
        return result;
    }
}
