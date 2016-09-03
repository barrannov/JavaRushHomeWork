package com.javarush.test.level26.lesson15.big01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Sasha on 14.08.2016.
 */
public class ConsoleHelper {
    static BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
    public static void writeMessage(String message){
        System.out.println(message);
    }
  public static   String readString(){
        String a = " ";
        try{
             a = reader.readLine();

        }
        catch (Exception e){}
        return a;
    }


    public static String askCurrencyCode()throws Exception{
      String currencyCode = " ";
        while (currencyCode.length()!=3) {
            currencyCode =  reader.readLine();
            if (currencyCode.length() != 3)
                System.out.println("Данные некоректны");

            else
                 currencyCode = currencyCode.toUpperCase();
        }
        return  currencyCode;
    }

    //public static  String[] getValidTwoDigits(String currencyCode){

    //}
}
