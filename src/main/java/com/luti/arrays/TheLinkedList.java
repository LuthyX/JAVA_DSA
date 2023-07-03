package com.luti.arrays;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkedList {
    public static void main(String[] args) {
        LinkedList<String> rec = new LinkedList<>();
        rec.add("Mole");
        rec.addFirst("Molee");
        rec.addLast("Mol");
        ListIterator<String> listIterator = rec.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
