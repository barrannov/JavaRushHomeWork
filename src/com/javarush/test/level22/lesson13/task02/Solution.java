package com.javarush.test.level22.lesson13.task02;

import java.io.*;
import java.nio.charset.Charset;

/* Смена кодировки
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        FileOutputStream outputStream = new FileOutputStream(args[1]);
        byte[] buffer =new byte[1000];
               Charset koi8 = Charset.forName("Windows-1251");
               Charset windows1251 = Charset.forName("UTF8");

                inputStream.read(buffer);

               String s = windows1251.toString();
               buffer = s.getBytes(windows1251);
               outputStream.write(buffer);


        inputStream.close(); //закрываем оба потока. Они больше не нужны.
        outputStream.close();

    }
}
