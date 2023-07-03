package com.luti.java_refresh;

import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int  i = 1;
        int  p = 0;
        int  count = 2;
        while (count <= n){
            int temp = i;
            i = i +p;
            p = temp;
            count++;
        }
        System.out.println(i);
    }
}
