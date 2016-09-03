package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human ch1 = new Human("Stepan", true, 67, new ArrayList<Human>());
        Human ch2 = new Human("Stepan", true, 67, new ArrayList<Human>());
        Human ch3 = new Human("Stepan", true, 67, new ArrayList<Human>());
        ArrayList<Human> ch = new ArrayList<Human>();
        ch.add(ch1);
        ch.add(ch2);
        ch.add(ch3);

        Human father = new Human("Stepan", true, 67, ch);
        Human mother = new Human("Stepan", true, 67, ch);
        ArrayList<Human> parents1 = new ArrayList<>();
        ArrayList<Human> parents2 = new ArrayList<>();
        parents1.add(father);
        parents2.add(mother);

        Human grandp1 = new Human("Stepan", true, 67, parents1);
        Human grandp2 = new Human("Stepan", true, 67, parents2);
        Human grandm1 = new Human("Stepan", true, 67, parents1);
        Human grandm2 = new Human("Stepan", true, 67, parents2);



        System.out.println(grandp1);
        System.out.println(grandp2);
        System.out.println(grandm1);
        System.out.println(grandm2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;
        Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
