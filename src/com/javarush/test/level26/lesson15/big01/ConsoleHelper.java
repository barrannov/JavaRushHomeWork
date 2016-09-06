package com.javarush.test.level26.lesson15.big01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sasha on 14.08.2016.
 */
public class ConsoleHelper {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String a = " ";
        try {
            a = reader.readLine();

        } catch (Exception e) {
        }
        return a;
    }


    public static String askCurrencyCode() throws Exception {
        writeMessage("Введите код валюты");
        String currencyCode = " ";
        while (currencyCode.length() != 3) {
            currencyCode = reader.readLine();
            if (currencyCode.length() != 3) {
                writeMessage("Данные некоректны");
                currencyCode = reader.readLine();
            }


        }
        return currencyCode.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode) throws IOException {
        while (true) {
            try {
                writeMessage("Введите два значения");

                String[] line = readString().split(" ");

                if (Integer.parseInt(line[0]) < 0 || Integer.parseInt(line[1]) < 0 || line.length != 2) {
                    writeMessage("Данные некоректны");
                    continue;
                }
                return line;

            } catch (Exception e) {
                writeMessage("Данные некоректны");
                continue;
            }


        }


    }
   public static Operation askOperation(){
        System.out.println("Select the operation: 1 - INFO, 2 - DEPOSIT, 3 - WITHDRAW, 4 - EXIT;");
        Operation operation = null;
        while(operation == null)
        {
            try
            {
                operation = Operation.getAllowableOperationByOrdinal(Integer.parseInt(readString()));
            }
            catch (IllegalArgumentException e)
            {
                operation = null;
                System.out.println("Try again to select the operation: 1 - INFO, 2 - DEPOSIT, 3 - WITHDRAW, 4 - EXIT;");
            }
        }
        return operation;
    }
}
