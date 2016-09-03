package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {   //A:/q.txt
        //add your code here
        Scanner scan = new Scanner(System.in);
        InputStream inStream = new FileInputStream(scan.nextLine());


        while (inStream.available() > 0)
        {

            System.out.print((char)inStream.read()) ; //читаем один байт из потока для чтения
        }

        inStream.close(); //закрываем потоки

    }
}
