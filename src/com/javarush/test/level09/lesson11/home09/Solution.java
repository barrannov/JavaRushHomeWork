package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        HashMap<String, Cat> cats = new HashMap<String, Cat>();
        cats.put("Q", new Cat("Q"));
        cats.put("Q2", new Cat("Q2"));
        cats.put("Qdsd", new Cat("Qdsd"));
        cats.put("Qw", new Cat("Qw"));
        cats.put("Qe", new Cat("Qe"));
        cats.put("Qr", new Cat("Qr"));
        cats.put("Qt", new Cat("Qt"));
        cats.put("Qy", new Cat("Qy"));
        cats.put("Qu", new Cat("Qu"));
        cats.put("Qi", new Cat("Qi"));
        convertMapToSet(cats);
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> qw2 = new HashSet<Cat>();

        for (Map.Entry<String, Cat> qw : map.entrySet()){
            qw2.add(qw.getValue());
        }
        return qw2;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
