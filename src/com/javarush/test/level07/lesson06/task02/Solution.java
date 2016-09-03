package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
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
        for(int i = 0; i< 5; i++){
            list.add(scn.nextLine());
        }
        ArrayList<String> list2 = new ArrayList<String>();
        int max = list.get(0).length();
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() > max)
            {
                max = list.get(i).length();
            }
        }
            for (int b = 0; b < list.size(); b++) {
              if (max == list.get(b).length()){
                    System.out.println(list.get(b));
                }
            }
        }
    }
