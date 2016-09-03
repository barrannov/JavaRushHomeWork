package com.javarush.test.level20.lesson10.home03;

import java.io.*;

/* Найти ошибки
Почему-то при сериализации/десериализации объекта класса B возникают ошибки.
Найдите проблему и исправьте ее.
Класс A не должен реализовывать интерфейсы Serializable и Externalizable.
Сигнатура класса В не содержит ошибку :)
Метод main не участвует в тестировании.
*/
public class Solution implements Serializable{
    private static final long serialVersionUID =1L;
    public Solution(){

    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutput = new FileOutputStream("//A:/q.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
        Solution s = new Solution();
          Solution.B b =s.new B("B");
        System.out.println(b.toString());
        outputStream.writeObject(b);
        fileOutput.flush();
        fileOutput.close();
        outputStream.close();

        FileInputStream fiStream = new FileInputStream("//A:/q.txt");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);

        B b1 = (B) objectStream.readObject();
        System.out.println(b1.toString());
        fiStream.close();
        objectStream.close();


    }

    public static class A {

        protected String name = "A";
        public A(){

        }
        public A(String name) {
            this.name += name;
        }
    }

    public class B extends A implements Serializable {
        private static final long serialVersionUID =1L;

        public B(String name) {
            super(name);
            this.name += name;
        }
        private void writeObject(ObjectOutputStream out) throws IOException {
            out.defaultWriteObject();
            out.writeObject(name);
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            in.defaultReadObject();
            String n = (String) in.readObject();
            name = n;
        }
    }
}
