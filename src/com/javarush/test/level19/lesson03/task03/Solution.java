package com.javarush.test.level19.lesson03.task03;

/* Адаптация нескольких интерфейсов
Адаптировать IncomeData к Customer и Contact.
Классом-адаптером является IncomeDataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
Дополнить телефонный номер нулями до 10 цифр при необходимости (смотри примеры)
Обратите внимание на формат вывода фамилии и имени человека
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");

    }

    public static class IncomeDataAdapter implements Customer, Contact {
        IncomeData inc;
        public IncomeDataAdapter(IncomeData inc){
            this.inc = inc;
        }
        @Override
        public String getName() {
            return  inc.getContactLastName()+", "+inc.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String str = "";


            int number = 10 - Integer.toString(this.inc.getPhoneNumber()).length();
            while (number > 0){
                str += 0;
                number--;
            }

            str += Integer.toString(this.inc.getPhoneNumber());
            String str_result = "+" + "" + this.inc.getCountryPhoneCode() + "(" + str.substring(0,3) + ")" + str.substring(3,6) + "-" + str.substring(6,8) + "-" + str.substring(8,10);
            return str_result; }

        @Override
        public String getCompanyName() {
            return  inc.getCompany();
        }

        @Override
        public String getCountryName() {
            String b = null;
            for (Map.Entry<String, String> a : countries.entrySet()){
                if(inc.getCountryCode().equals(a.getKey())){
                    b = a.getValue();
                }
            }
            return b;
        }
    }

    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}