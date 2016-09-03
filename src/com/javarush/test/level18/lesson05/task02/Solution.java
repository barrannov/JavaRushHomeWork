package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources &#044;

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        FileInputStream inputStream = new FileInputStream(scan.nextLine());
        char a = ',';
        int count=0;
        while (inputStream.available()>0){
            int data= inputStream.read();
            if(data== a){
                count++;
            }
        }
        System.out.print(count);
        inputStream.close();
        scan.close();

    }
}
