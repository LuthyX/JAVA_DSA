package com.luti.ArraysAndArrayList.questions;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder {

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(createTargetArray(nums, index));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> numsList = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            numsList.add(index[i], nums[i]);
        }
        int[] arr = new int[numsList.size()];
        for(int i = 0; i<numsList.size(); i++){
            arr[i] = numsList.get(i);
        }
        return arr;
    }
}
