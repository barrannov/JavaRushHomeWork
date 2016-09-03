package com.javarush.test.level26.lesson15.big01;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sasha on 17.08.2016.
 */
public class CurrencyManipulator {
    String currencyCode;
    Map<Integer, Integer> denominations = new HashMap<Integer, Integer>();

    public String getCurrencyCode() {
        return currencyCode;
    }

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
