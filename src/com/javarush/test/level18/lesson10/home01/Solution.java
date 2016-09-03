package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        ArrayList<String> list = new ArrayList<String>();
        int count = 0;
        while (reader.ready()){
            int data = reader.read();
            if((data >= Integer.valueOf('A') && data <= Integer.valueOf('Z'))
                    || (data >= Integer.valueOf('a') && data <= Integer.valueOf('z'))){
                count++;
            }
            //.replaceAll("[^A-Za-z]", " ");
//            String[] a = data.split(" ");
//            for (int i = 0; i< a.length; i++){
//                    for(char b='A'; b<='z'; b++){
//                        char[] ach = a[i].toCharArray();
//                        for (int t = 0; t< ach.length; t++){
//                            if(ach[t]==b){
//                                count++;
//                            }
//                        }
//                    }
//            }
        }

        System.out.print(count);
    }
}
