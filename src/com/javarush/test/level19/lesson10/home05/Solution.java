package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
        FileWriter fileOutputStream = new FileWriter(args[1]);
        String[]a = new String[]{};
        while (bufferedReader.ready()){
            a = bufferedReader.readLine().split(" ");
            for (int i= 0; i<a.length; i++){
                if(i==a.length-1){
                    if (a[i].matches(".*[0-9].*")){
                        fileOutputStream.write(a[i]);
                    }
                }else {
                    if(a[i].matches(".*[0-9].*")){
                        fileOutputStream.write(a[i]+" ");
                    }
                }

            }
            fileOutputStream.write(" ");
        }


        bufferedReader.close();
        fileOutputStream.close();
    }
}
