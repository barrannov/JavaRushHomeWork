package com.javarush.test.level26.lesson15.big01;

import java.util.HashMap;

/**
 * Created by Sasha on 17.08.2016.
 */
public  class CurrencyManipulatorFactory {
    static HashMap<String,CurrencyManipulator> manipulators = new HashMap<>();
    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode){
        CurrencyManipulator manipulator = null;
        if(manipulators.containsKey(currencyCode)){
            return manipulators.get(currencyCode);
        }else {
            manipulator = new CurrencyManipulator(currencyCode);
            manipulators.put(currencyCode,manipulator);
            return manipulator;
        }
    }

    private CurrencyManipulatorFactory() {
    }

}
