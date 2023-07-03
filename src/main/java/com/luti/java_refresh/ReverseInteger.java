package com.luti.java_refresh;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int reverseNum = 0;

//        if (num /10 == 0){
//            System.out.println(num
//            );
//        }
        while (num > 0) {
           reverseNum =  reverseNum * 10 + (num % 10) ;
           num = num / 10;
        }
        System.out.println(reverseNum);
    }
}
