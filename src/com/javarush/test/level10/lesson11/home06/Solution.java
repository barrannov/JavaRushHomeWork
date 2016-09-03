package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
       private String a;
       private String b;
       private int c;
       private double n;
       private int ou;
       private String lk;
        public Human(String a, String b){
         this.a =a+b;
        }
        public Human(int a, int b){
            this.c =a+b;
        }
        public Human(String a, String b, String c){
            this.a =a+b+c;
        }
        public Human(String a, String b, int t){
            this.a =a+b;
        }
        public Human(String a, String b, String c, String m){
            this.a =a+b+c;
        }

        public Human(int a, int b, int c){
            this.c =a+b+c;
        }

        public Human(int a, int b, int c, int t){
            this.c =a+b+c+t;
        }

        public Human(int a, int b, int c, int t, int lk){
            this.c =a+b+c+t+lk;
        }
        public Human(int a, int b, int c, int t, int lk, String n){
            this.c =a+b+c+t+lk;
            this.lk = n;
        }
        public Human(int a, int b, int c, int t, int lk, String n, String h){
            this.c =a+b+c+t+lk;
            this.lk = n+h;
        }
    }
}
