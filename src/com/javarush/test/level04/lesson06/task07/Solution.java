package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if(n1!=n2&&n1!=n3&&n2==n3)
            System.out.print(1);
        if(n2!=n3&&n2!=n1&&n1==n3)
            System.out.print(2);
        if(n3!=n2&&n3!=n1&&n1==n2)
            System.out.print(3);

    }
}
