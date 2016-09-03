package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream in = new FileInputStream(scanner.nextLine());
        FileOutputStream out = new FileOutputStream(scanner.nextLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        while (in.available()>0){
            list.add(in.read());
        }

        System.out.println(" ");
        for (int i = list.size()-1; i>=0;i--){
            out.write(list.get(i));

        }
        in.close();
        out.close();
        scanner.close();

    }
}
