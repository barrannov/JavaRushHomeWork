package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
    ArrayList<String> list = new ArrayList<String>();
        Scanner scn = new Scanner(System.in);
        for (int i =0; i<5; i++){
            list.add(scn.nextLine());
        }

        String min = list.get(0);
        for (int i =0; i<5; i++){
            for (int b =0; b<5; b++)
            {
                if (min.length() > list.get(b).length())
                {
                    min = list.get(b);
                }
            }
            if (list.get(i).length() == min.length() ){
                System.out.println(list.get(i));
            }
        }



    }
}
