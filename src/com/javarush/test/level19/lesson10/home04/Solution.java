package com.javarush.test.level19.lesson10.home04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

/* Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words
Закрыть потоки. Не использовать try-with-resources

Пример: words содержит слова А, Б, В
Строки:
В Б А Д  //3 слова из words, не подходит
Д А Д    //1 слово из words, не подходит
Д А Б Д  //2 слова - подходит, выводим
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("file");
        words.add("vid");
        words.add("V");
    }

    public static void main(String[] args)  throws Exception{
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader =
                new BufferedReader(new FileReader(scanner.nextLine()));
        while (bufferedReader.ready()){
            String line =  bufferedReader.readLine();
            String[] w =line.split(" ");
            int count = 0;
            for (int i = 0; i< w.length; i++){
                        if (words.contains(w[i])){
                            count++;
                        }
                }
                if (count==2)
                System.out.println(line);



        }
        scanner.close();
        bufferedReader.close();
    }
}
