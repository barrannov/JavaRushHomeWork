package com.javarush.test.level26.lesson15.big01;


import java.util.Locale;

/**
 * Created by Sasha on 14.08.2016.
 */
public class CashMachine {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ENGLISH);


            String currencyCode = ConsoleHelper.askCurrencyCode();
            String[] validTwoDigits = ConsoleHelper.getValidTwoDigits(currencyCode);
            CurrencyManipulator currencyManipulator =  CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);
            currencyManipulator.addAmount(Integer.parseInt(validTwoDigits[0]), Integer.parseInt(validTwoDigits[1]));

            currencyManipulator.getTotalAmount();

    }
}
