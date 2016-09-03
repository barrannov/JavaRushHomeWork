package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{

    public static void main(String[] args) throws IOException
    {
        //A:/q.txt
        Scanner scan = new Scanner(System.in);
        OutputStream out = new FileOutputStream(scan.nextLine());

        while (true){
       String a = scan.nextLine();
            String b =a+System.lineSeparator();

            InputStream in = new StringBufferInputStream(b);


            in.close();
       // out.write((char)Integer.parseInt(a));
            while (in.available() > 0)
            {
                int data = in.read(); //читаем один байт из потока для чтения
                out.write(data );

                //записываем прочитанный байт в другой поток.
            }
            if(a.equals("exit")){
                break;
            }
        }

      out.close();
    }
}
