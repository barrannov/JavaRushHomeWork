package com.javarush.test.level26.lesson15.big01;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sasha on 17.08.2016.
 */
public  class  CurrencyManipulator {
    String currencyCode;
     Map<Integer, Integer> denominations = new HashMap<Integer, Integer>();

    public String getCurrencyCode() {
        return currencyCode;
    }

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void addAmount(int denomination, int count) {
        if (denominations.keySet().contains(denomination))
            denominations.put(denomination, denominations.get(denomination) + count);
        else
            denominations.put(denomination, count);
    }

     public int getTotalAmount(){
        int total = 0;
        for (Map.Entry<Integer, Integer> t : denominations.entrySet()){
            total=total+(t.getKey()*t.getValue());
        }
        return total;
    }
}
