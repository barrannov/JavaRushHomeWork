package com.javarush.test.level22.lesson09.task02;

import java.util.*;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {
    public static   Map<String, String > map = new LinkedHashMap<String, String>();

    public static void main(String []args){

        map.put("name", null);
        map.put("country", "Ukraine");
        map.put("city", null);
        map.put("age", null);


        getCondition(map);

    }

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder out = new StringBuilder();
        int count=0;
        int p =  0;

        for (Map.Entry<String, String> pair: params.entrySet()){
            if(pair.getValue()==null) {
            p++;
            }
        }
        for (Map.Entry<String, String> pair: params.entrySet()){
            count++;
            if(pair.getValue()!=null) {
                out.append(pair.getKey()+" = '"+pair.getValue()+"'");
                if(count<params.size()-p) {
                    out.append(" and ");
                }
            }
        }
        System.out.print(out);
        return out;
    }
}
