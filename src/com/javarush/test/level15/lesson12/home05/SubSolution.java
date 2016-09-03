package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Sasha on 09.07.2016.
 */
public class SubSolution extends Solution {
    public SubSolution(String s){super(s);}
    public SubSolution(String s, String ss){super(s, ss);}
    public SubSolution(String s, int sa){super(s, sa);}

    private SubSolution(int n){super(n);}
    private SubSolution(int n, int nn){super(n, nn);}
    private SubSolution(int n, String ns){super(n, ns);}

    protected SubSolution(boolean b){super(b);}
    protected SubSolution(boolean b, boolean bb){super(b, bb);}
    protected SubSolution(boolean b, String bs){super(b, bs);}

    SubSolution(float t){super(t);}
    SubSolution(float t, float tt){super(t, tt);}
    SubSolution(float t, String ts){super(t, ts);}
}