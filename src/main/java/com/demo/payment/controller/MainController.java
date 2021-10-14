package com.demo.payment.controller;

import com.demo.payment.controller.dto.RecurringForm;
import com.demo.payment.domain.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {

    @GetMapping("payment")
    public String payment (Model model) {
        model.addAttribute("price", 120000);
        return "paymentForm";
    }

    @GetMapping("/recurring")
    public String recurring (Model model) {
        RecurringForm recurringForm = new RecurringForm();
        model.addAttribute("recurringForm", recurringForm);
        return "recurringForm";
    }

    @PostMapping("/recurring/confirm")
    public String recurringConfirm (@Valid RecurringForm form, BindingResult result) {
        if (result.hasErrors()) {
            return "recurringForm";
        }

        return "/";
    }

    @PostMapping("paymentconfirm")
    public String paymentconfirm (Model model, Transaction transaction) {
        //유효기간 부분
//        String cardExpired1 = transaction.getCardExpired1();
//        cardExpired1 = cardExpired1.replaceAll("[0-9]", "*");
//        model.addAttribute("cardExpired1", cardExpired1);
        model.addAttribute("price", 120000);
        model.addAttribute("m", transaction);
        return "paymentconfirmForm";
    }
}
