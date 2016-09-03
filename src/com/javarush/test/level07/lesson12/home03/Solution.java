package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scn = new Scanner(System.in);
        int [] m = new int[20];
        for (int i=0;i<m.length; i++ ){
            m[i]=scn.nextInt();
        }
        int max= m[0];
        for (int i=0;i<m.length; i++ )
        {
            if(max<m[i])
                max= m[i];

        }
        int min= m[0];

        for (int i=0;i<m.length; i++ )
        {
            if(min>m[i]){
                min= m[i];
            }
        }


        int  maximum = max;
        int  minimum = min;

        //напишите тут ваш код


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
