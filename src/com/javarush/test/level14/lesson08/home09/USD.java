package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Sasha on 08.07.2016.
 */
public class USD extends Money {

    public USD(double amount)
    {
        super(amount);
    }

    public double getAmount(){
        return super.getAmount();
    }
    public String getCurrencyName() {
        return "USD";
    }
}
