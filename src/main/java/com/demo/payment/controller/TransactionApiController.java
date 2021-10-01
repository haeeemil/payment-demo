package com.demo.payment.controller;

import com.demo.payment.controller.dto.PaymentRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TransactionApiController {

    @PostMapping("/api/v1/payment")
    public String payment(@Valid PaymentRequest request) {
        return "";
    }
}
