package com.javarush.test.level02.lesson05.task01;

/* 19
Закоментарь максимальное количество строк, чтобы на экран вывелось число 19
*/
public class Solution
{
    public static void main(String[] args)
    {
        int x = 1;
        int y = 0;

        y = y + x; //1

       x = x * 2; //2
        y = y + x;// 4

        x = x * 2; //4
        //y = y + x; //8

        x = x * 2;// 8
        y = y + x; //16

       // x = x * 2;// 16
        y = y + x; //32

        System.out.println(y);
    }
}
