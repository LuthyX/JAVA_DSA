package com.luti.java_refresh;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(largest(a,b,c));


    }
    public static int largest(int a, int b, int c){
        int h = 0;
        if(a>b){
            h = a;
        }
        else {
            h =b;
        }
        if (c > h){
            h = c;
        }
        else {
            return h;
        }
        return h;
    }
}
