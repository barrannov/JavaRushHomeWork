package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {


        Scanner scan = new Scanner(System.in);
        HashMap<String, String> adresess = new HashMap<String, String>();
        while (true){
            String town = scan.nextLine();
            if (town.isEmpty()){
                break;
            }
            String name = scan.nextLine();
            if(name.isEmpty()){
                break;
            }
            adresess.put(town,name);
        }

        String l = scan.nextLine();
        for (Map.Entry<String, String> qw : adresess.entrySet()){
                if(l.equals(qw.getKey())){
                    System.out.print(qw.getValue());
                }
        }
    }
}
