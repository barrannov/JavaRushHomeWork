package com.javarush.test.level07.lesson04.task03;

import javax.security.sasl.SaslClient;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String[] st = new String[10];
        int[] in= new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            st[i] = sc.nextLine();
            in[i]=st[i].length();
        }
        for (int i=0; i<10; i++){
            System.out.println(in[i]);
        }

    }
}
