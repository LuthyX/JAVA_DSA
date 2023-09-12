package com.luti.ArraysAndArrayList.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4,3,2,1};
        int target = 9;
        int ans = orderAgnosticBs(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBs(int[] arr, int target){
        boolean asc = arr[0] < arr[arr.length-1];
        int start =0;
        int end  = arr.length-1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if (asc){
                if (target < arr[mid]){
                    end  = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if (target > arr[mid]){
                    end  = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
