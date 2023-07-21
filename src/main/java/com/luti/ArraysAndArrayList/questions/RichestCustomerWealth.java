package com.luti.ArraysAndArrayList.questions;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(richestCustomerWealth(accounts));
    }

    static int richestCustomerWealth(int[][] accounts) {
        int[] arr = new int[accounts.length];
        int max = 0;
        for(int i=0; i<accounts.length; i++){
            int sum =0;
            for(int j=0; j<accounts[i].length; j++){
                sum =sum+accounts[i][j];
            }
            arr[i] = sum;

        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;

    }
}
