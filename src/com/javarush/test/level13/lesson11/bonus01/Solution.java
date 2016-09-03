package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.*;

public class Solution
{
    public static List<Integer> lines = new ArrayList<Integer>();

    public static void main(String[] args) throws FileNotFoundException{
        for (int s : lines)
            System.out.println(s);
    }
    static  {
        Scanner scan = new Scanner(System.in);
        try{
            BufferedReader fin = new BufferedReader(new FileReader(scan.nextLine()));
            int line;
            while ((line = Integer.parseInt(fin.readLine())) != 0){
                if(line%2==0){
                    lines.add(line);
                }


            }
            fin.close();
        }
        catch (Exception a){}
        Collections.sort(lines, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

    }
}
