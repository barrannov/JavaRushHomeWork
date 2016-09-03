package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1984"));
        map.put("Ivan", new Date("MAY 15 1985"));
        map.put("Peta", new Date("JANUARY 11 1986"));
        map.put("Vasa", new Date("APRIL 25 1987"));
        map.put("Vlad", new Date("JULY 12 1970"));
        map.put("Lala", new Date("DECEMBER 13 1990"));
        map.put("Ibram", new Date("OCTOBER 29 1988"));
        map.put("Lamar", new Date("JUNE 11 1987"));
        map.put("Host", new Date("AUGUST 7 1994"));
        map.put("Mast", new Date("JUNE 6 1985"));

        //напишите тут ваш код
        //removeAllSummerPeople(map);
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Map.Entry<String, Date> data;
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            data = iterator.next();

            if((data.getValue().getMonth()>4)&&(data.getValue().getMonth()<8)){
                iterator.remove();
            }
        }




    }
}
