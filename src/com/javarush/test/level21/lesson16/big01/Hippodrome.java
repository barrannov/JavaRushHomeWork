package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sasha on 20.07.2016.
 */
public class Hippodrome {
    public static ArrayList<Horse> horses = new ArrayList<Horse>();
    public  static  Hippodrome game;
    public ArrayList<Horse> getHorses(){
        return horses;
    }
    public static void main(String []args) throws Exception{
     game = new Hippodrome();

        game.horses.add(new Horse("Stella",3,0));
        game.horses.add(new Horse("Avrora",3,0));
        game.horses.add(new Horse("Zvezda",3,0));


            game.run();

        game.printWinner();
    }

    public void run() throws Exception{
        for (int i = 1; i<=100; i++){
            move();
            Thread.sleep(200);
            print();
        }
    }
    public void move(){
        for(int i = 0; i<horses.size(); i++){
            horses.get(i).move();
        }
    }
    public void print(){
        for(int i = 0; i<horses.size(); i++){
            horses.get(i).print();
        }
        System.out.println();
        System.out.println();
    }

    public Horse getWinner(){
        Horse horse = new Horse("Nobody", 0, 0);
        for (int i =0; i<horses.size(); i++){
            if(horses.get(i).getDistance()>horse.getDistance()){
                horse = horses.get(i);
            }

        }
        return horse;
    }

    public void printWinner(){
        System.out.println("Winner is "+getWinner().getName()+"!");
    }
}
