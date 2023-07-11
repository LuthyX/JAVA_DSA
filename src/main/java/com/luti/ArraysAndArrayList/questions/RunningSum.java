package com.luti.ArraysAndArrayList.questions;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        int temp = nums[0];
        for(int i =1; i<nums.length; i++){
            runningSum[i] = temp + nums[i];
            temp = runningSum[i];
        }
        return runningSum;
    }
}
