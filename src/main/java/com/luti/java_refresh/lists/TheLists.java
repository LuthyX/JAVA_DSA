package com.luti.java_refresh.lists;

import java.util.*;

public class TheLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("green");
        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        Stack<String> stack = new Stack<>();
        stack.add("Mol");
        stack.add("Mole");
        stack.add("Mole");


    }
}
