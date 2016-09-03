package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, Double> hashMap = new HashMap<String, Double>();
        BufferedReader  reader = new BufferedReader(new FileReader(args[0]));
        while (reader.ready()){
            String[] a = reader.readLine().split(" ");
          for  (Map.Entry<String, Double> pair : hashMap.entrySet()){
              if(a[0].equals(pair.getKey())){
                  hashMap.put(pair.getKey(), hashMap.get(pair.getKey()) + Double.parseDouble(a[1]));
              }
          }

            hashMap.put(a[0],Double.parseDouble(a[1]));
        }
    }
}
