package com.javarush.test.level20.lesson10.home05;

import java.io.*;
import java.util.logging.Logger;

/* Сериализуйте Person
Сериализуйте класс Person стандартным способом. При необходимости поставьте полям модификатор transient.
*/
public class Solution {
    public static void main(String args[])throws IOException{
        FileOutputStream fileOutputStream =new FileOutputStream("//A:/q.txt");
        ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);

        Person person = new Person("Sasha", "Baranov", "Ukraine", Sex.MALE);
        objectOutputStream.writeObject(person);

        fileOutputStream.close();
        objectOutputStream.close();


    }
    public static class Person implements Serializable {

        String firstName;
        String lastName;
        transient String fullName;
       transient final String greetingString;
        String country;
        Sex sex;
       transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greetingString = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }
}
