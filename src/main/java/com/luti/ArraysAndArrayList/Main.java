package com.luti.ArraysAndArrayList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Arrays
        // syntax
        // datatype[] variable_name = new datatype[size]
//        int[] rnos = new int[5];
//                OR
//        int[] ros2 = {2,3,4};

        int[] ros; // declaration of an integer array, ros is getting defined in stack memory;
        ros = new int[5]; // initialization: actually here object is being created in the memory (heap);

        System.out.println(ros[0]);
        String[] arr = new String[3];
        System.out.println(arr[0]);

        int[] intArr = {2,0,8,0,6,9,10,0,22,1};
//        swap(intArr, 2,4);
//        System.out.println(Arrays.toString(intArr));
//        reverse(intArr);
//        System.out.println(Arrays.toString(intArr));
//        System.out.println(secondMax(intArr));
        moveZerosToEnd(intArr);
        System.out.println(Arrays.toString(intArr));

    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            swap(arr, start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int secondMax(int[] arr){
        int max=0;
        int max2=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max2 = max;
                max = arr[i];
            } else if (arr[i]> max2 && arr[i] != max) {
                max2 = arr[i];
            }
        }
        return max2;
    }

    static void moveZerosToEnd(int[] arr){
        int j = 0; // this will focus on zero elements
        for (int i=0; i<arr.length; i++) { // i will focus on non-zero Elements
            if (arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0){
                j++;
            }
        }
    }

}
