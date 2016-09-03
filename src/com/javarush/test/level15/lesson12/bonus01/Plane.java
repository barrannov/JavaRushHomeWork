package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Sasha on 13.07.2016.
 */
public class Plane implements Flyable {
    @Override
    public void fly() {

    }
    private int ammount = 0;
    public   Plane(int ammount){
      this.ammount= ammount;
    }
}
