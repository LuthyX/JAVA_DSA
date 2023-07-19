package com.luti.ArraysAndArrayList.questions;

import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr, 3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> results = new ArrayList<>();
        int max=0;
        Boolean exCandie = false;
        for(int i = 0; i<candies.length; i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i = 0; i<candies.length; i++){
            if(candies[i] + extraCandies >= max){
                exCandie = true;
                results.add(exCandie);
            }
            else {
                exCandie = false;
                results.add(false);
            }
        }
        return results;
    }
}
