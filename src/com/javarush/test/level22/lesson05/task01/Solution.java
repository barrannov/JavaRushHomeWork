package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static void main(String [] args) throws TooShortStringException{
        String h  =" 1 1 1 1 ";
        System.out.print(getPartOfString(h));
    }
    public static String getPartOfString(String string) throws TooShortStringException{
        try{
            String b [] = string.split(" ");
            if(b.length<5){
                throw new TooShortStringException();
            }
            int q1 = string.indexOf(" ")+1;
            String w1= string.substring(q1);
            int q2 = w1.indexOf(" ")+1;
            String w2= w1.substring(q2);
            int q3 = w2.indexOf(" ")+1;
            String w3= w2.substring(q3);
            int q4 = w3.indexOf(" ")+1;
            String w4= w3.substring(q4);
            int q5 = w4.indexOf(" ")+1;
            String a = string.substring(q1, q5+q4+q3+q2+q1-1);
            return a;
        }
           catch (Exception e){
               throw new TooShortStringException();
           }
        }



    public static class TooShortStringException extends Exception  {
        public TooShortStringException( ){
            super();
        }

        public TooShortStringException(Throwable throwable){
            super(throwable);
        }
    }
}
