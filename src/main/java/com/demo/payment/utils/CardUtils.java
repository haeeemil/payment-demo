package com.demo.payment.utils;

import com.demo.payment.domain.CardType;

public class CardUtils {

    public static String getCardType(int bin) {

        return "";
    }

    public static boolean isRightCardNumber(String cardNumber1) {
        if(cardNumber1.startsWith("8")){
            return false;
        }



        return true;

    }


}
