package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream  implements AmigoStringWriter  {
    FileOutputStream f ;

    AdapterFileOutputStream(FileOutputStream f){
        this.f = f;
    }
    public void flush() throws IOException {
        f.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        byte[] d = s.getBytes();
        f.write(d);
    }

    @Override
    public void close() throws IOException {
        f.close();
    }
}

