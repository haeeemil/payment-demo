package com.demo.payment.utils;

import com.demo.payment.domain.CardType;

public class CardUtils {

    public static CardType getCardType(int bin) {

        return CardType.JCB;
    }

    public static String getMaskingCardNumber(int cardNumber) {
        return "";
    }
}
