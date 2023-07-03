package com.luti.java_refresh.lists;

public class Shadowing {
    static int x = 10;
    public static void main(String[] args) {

        System.out.println(x); // Would print 10

        int x = 30;

        System.out.println(x); // Would print 30

        fun();  // Would print 10

    }

    static void fun(){
        System.out.println(x);
    }
}
