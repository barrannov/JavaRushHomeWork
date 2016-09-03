package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    //Напишите тут ваши методы
    public int min(int a, int b){
        int c;
        if (a<b)
            c=a;
        else
            c =b;
        return c;
    }

    public long min(long a, long b){
        long c;
        if (a<b)
            c=a;
        else
            c =b;
        return c;
    }

    public double min(double a, double b){
        double c;
        if (a<b)
            c=a;
        else
            c =b;
        return c;
    }
}
