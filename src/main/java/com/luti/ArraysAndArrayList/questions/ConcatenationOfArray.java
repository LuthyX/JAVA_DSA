package com.luti.ArraysAndArrayList.questions;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int j = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(i != j){
                ans[i] = nums[i];
            }
            ans[j] = nums[i];
            j++;
        }
        return ans;
    }
}
