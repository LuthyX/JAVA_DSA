package com.luti.java_refresh.arrays;

import java.util.HashSet;
import java.util.Set;

public class TheSets {
    public static void main(String[] args) {
        Set<Balls> ballsSet = new HashSet<>();
        ballsSet.add(new Balls("green"));
        ballsSet.add(new Balls("red"));
        ballsSet.add(new Balls("blue"));
        System.out.println(ballsSet.size());
        ballsSet.forEach(System.out::println);
    }
    static class Balls{
        private String color;

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public String toString() {
            return super.toString();
        }

        Balls(String color) {
            this.color = color;
        }
    }
}
