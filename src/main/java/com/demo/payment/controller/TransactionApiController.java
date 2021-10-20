package com.demo.payment.controller;

import com.demo.payment.controller.dto.PaymentRequest;
import com.demo.payment.controller.dto.RecurringForm;
import com.demo.payment.controller.dto.RecurringRequest;
import com.demo.payment.controller.dto.RecurringResponse;
import com.demo.payment.utils.CardUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.*;

@RestController
public class TransactionApiController {

    @PostMapping("/api/v1/payment")
    public String payment(@Valid PaymentRequest request) {
        return "";
    }

    @PostMapping("/api/v1/recurring")
    public List<Map<String, String>> recurring(@RequestBody @Valid RecurringRequest request, BindingResult result) {
        List<Map<String, String>> resultList = new ArrayList<>();
        Map<String, String> resultMap = null;

        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError e : list) {
                System.out.println(((FieldError) e).getField());
                System.out.println(e.getDefaultMessage());
                System.out.println();

                resultMap = RecurringResponse.getMap(((FieldError) e).getField(), e.getCode(), e.getDefaultMessage());
                resultList.add(resultMap);
            }
        }

        /*if(!CardUtils.getCardType(request.getCardNumber1())) {
            resultMap = RecurringResponse.getMap("cardNumber", "Invalid Card", "유효하지 않은 카드번호입니다.");
        }*/


        for (Map<String, String> map : resultList) {
            System.out.println(map.get("fieldName"));
            System.out.println(map.get("className"));
            System.out.println(map.get("resultMessage"));
            System.out.println();
        }

        return resultList;
    }

}
