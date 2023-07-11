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

        int[] intArr = {2,4,5,7,6,9};
        swap(intArr, 2,4);
//        System.out.println(Arrays.toString(intArr));
        reverse(intArr);
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
}
