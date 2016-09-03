package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        int a = Integer.parseInt(number1);
        String number2 = reader.readLine();
        int b = Integer.parseInt(number2);
        String number3 = reader.readLine();
        int c = Integer.parseInt(number3);


        boolean q =a> 0;
        boolean w =b > 0;
        boolean e =c > 0;

        if(q && w && e)
            System.out.println(3);
        else if((!q && w && e)||(q && !w && e)||(q && w && !e))
            System.out.println(2);
        else if ((q && !w && !e)||(!q && w && !e)||(!q && !w && e))
        System.out.println(1);
        else
            System.out.println(0);




    }
}
