package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileReader reader = new FileReader(scanner.nextLine());
        FileWriter writer = new FileWriter(scanner.nextLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (reader.ready()){
            list.add(reader.read());

        }
        for (int i = 0; i<list.size(); i++){

            if (i % 2 == 0){
                writer.write(list.get(i+1));
            }
        }
        reader.close();
        writer.close();
        scanner.close();
    }
}
