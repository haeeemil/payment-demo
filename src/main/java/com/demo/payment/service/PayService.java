package com.demo.payment.service;

import com.demo.payment.controller.dto.PayRequest;
import com.demo.payment.controller.dto.PayResponse;
import com.demo.payment.domain.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PayService {

    public static PayResponse pay(PayRequest request) throws Exception {
        PayResponse response = new PayResponse();
        return response;
    }
}
