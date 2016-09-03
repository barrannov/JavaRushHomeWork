package com.javarush.test.level19.lesson05.task05;

/* Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Удалить все знаки пунктуации, включая символы новой строки. Результат вывести во второй файл.
http://ru.wikipedia.org/wiki/%D0%9F%D1%83%D0%BD%D0%BA%D1%82%D1%83%D0%B0%D1%86%D0%B8%D1%8F
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(new FileInputStream(scanner.nextLine())));
        FileWriter fileOutputStream = new FileWriter(scanner.nextLine());
        while (bufferedReader.ready()){
            fileOutputStream.write(bufferedReader.readLine().replaceAll("\\W||[_]", ""));
        }

        scanner.close();
        bufferedReader.close();
        fileOutputStream.close();
    }
}
