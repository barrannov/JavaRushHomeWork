package com.javarush.test.level18.lesson03.task01;

import java.io.FileInputStream;
import java.util.Scanner;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        FileInputStream in = new FileInputStream(scan.nextLine());
        int a = 0;
        while (in.available()>0){
            int data = in.read();
            if(data>a){
                a = data;
            }
        }
        in.close();
        scan.close();
        System.out.println(a);

    }
}
