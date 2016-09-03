package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int m= scn.nextInt();
        //напишите тут ваш код
        for(int i= 0; i<n; i++ ){
            list.add(scn.nextInt());
        }

        for(int i =1; i<=m; i++){
            list.add(n,list.get(0));
            list.remove(0);

        }

        for (int s : list){
            System.out.println(s);
        }
    }
}
