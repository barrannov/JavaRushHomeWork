package com.javarush.test.level18.lesson03.task02;

import java.io.FileInputStream;
import java.util.Scanner;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        FileInputStream in = new FileInputStream(scan.nextLine());

        int c = 0;

        int ta = 2147483647;
        while (in.available() > 0)
        {
            int data = in.read();


            if (data < ta)
            {
                ta=data;
            }
        }

            in.close();
            scan.close();
            System.out.println(ta);

    }
}
