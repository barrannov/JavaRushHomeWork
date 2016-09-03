package com.javarush.test.level18.lesson03.task03;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        FileInputStream in = new FileInputStream(scan.nextLine());
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        while (in.available() > 0)
        {
            int data = in.read();
           if(hashMap.containsKey(data)){
               hashMap.put(data, hashMap.get(data)+1);
           }
            else {
               hashMap.put(data, 1);
           }
        }
        int a = -2147483647;
        for (Map.Entry<Integer, Integer> pair: hashMap.entrySet())
        {

            if (pair.getValue()>a){
                a=pair.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> pair: hashMap.entrySet())
        {
            if (pair.getValue() == a)
            {
                System.out.print(pair.getKey()+" ");
            }

        }
        in.close();
        scan.close();
    }
}
