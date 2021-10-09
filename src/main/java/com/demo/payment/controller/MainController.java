package com.demo.payment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("payment")
    public String payment (Model model) {
        model.addAttribute("price", 120000);
        return "paymentForm";
    }

    @GetMapping("recurring")
    public String recurring (Model model) {
        model.addAttribute("price", 120000);
        return "recurringForm";
    }

}
