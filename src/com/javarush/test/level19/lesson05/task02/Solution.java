package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        File f = new File(scanner.nextLine());
        BufferedReader fin = new BufferedReader(new FileReader(f));
        int count = 0;
        while (fin.ready()){
            String b  = fin.readLine().replaceAll("[\\p{Punct}]", " ");
            String[] a = b.split(" ");
            for(int i = 0; i< a.length; i++){
                if(a[i].equals("world")){
                    count++;
                }
            }

        }
        System.out.print(count);
        scanner.close();
        fin.close();
    }
}
