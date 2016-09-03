package com.javarush.test.level13.lesson11.bonus02;

public class Person implements RepkaItem
{
    public void pull(Person person){
        System.out.println(name+" за "+person.namePadezh);
    }
    public String getNamePadezh(){
        return namePadezh;
    }
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh)
    {
        this.name = name;
        this.namePadezh = namePadezh;
    }
}
