package com.luti.arrays;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
//        String[] colors = new String[5];
//        colors[0] = "purple";
//        colors[1] = "green";
//        colors[2] = "blue";
//        colors[3] = "yellow";
//        colors[4] = "red";
//
//        System.out.println(Arrays.toString(colors));
//
//        // Shorter way when you know the values of your array beforehand
//
//        int[] numbers = {3,6,5};
//
//        for (int i = 0; i < colors.length; i++) {
//            System.out.println(colors[i]);
//        }
//        for (int i = colors.length-1; i >= 0; i--) {
//            System.out.println(colors[i]);
//        }
//
//        for (String color : colors){
//            System.out.println(color);
//        }
//
//        Arrays.stream(colors).forEach(System.out::println);

//        ******************************************************

        char[][] board = new char[3][3];
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                board[i][j] = '-';
            }
        }
        char[][] board2 = new char[][]{
                new char[]{'-','-','-'},
                new char[]{'-','-','-'},
                new char[]{'-','-','-'}
        };
        System.out.println(Arrays.deepToString(board2));
        System.out.println(Arrays.deepToString(board));
    }
}
