package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int a;
        int b = 0;
        if (n1 > n2){
            a = n1;
        }
        else
        {
            a = n2;
        }
        for (int i = a; i>0; i--){
            if(n1%i==0&&n2%i==0){
                b =i;
                break;
            }
        }
        System.out.print(b);
    }
}
