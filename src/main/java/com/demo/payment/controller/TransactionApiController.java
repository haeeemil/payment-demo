package com.demo.payment.controller;

import com.demo.payment.controller.dto.PaymentRequest;
import com.demo.payment.controller.dto.RecurringRequest;
import com.demo.payment.controller.dto.RecurringResponse;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TransactionApiController {

    @PostMapping("/api/v1/payment")
    public String payment(@Valid PaymentRequest request) {
        return "";
    }

    @PostMapping("/api/v1/recurring")
    public RecurringResponse recurring(@RequestBody @Valid RecurringRequest request, BindingResult result) {
      RecurringResponse response = new RecurringResponse();

        if (result.hasErrors()) {
            // 에러 출력
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError e : list) {

                response.setSuccess(false);
                response.setMessage(e.getDefaultMessage());
            }
        }
      return response;
    }
}
