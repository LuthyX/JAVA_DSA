package com.luti.java_refresh;

public class OverLoading {
    public static void main(String[] args) {
        fun(1);
        fun('a');
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(char a){
        System.out.println(a);
    }
}
