package com.sparta.bubble;

import java.util.Arrays;

public class Printer {

    public void print (int [] numList1, int [] numList2, boolean sorted){
        if (sorted == true){
            System.out.println("Array 1 sorted: " + Arrays.toString(numList1));
            System.out.println("Array 2 sorted: " + Arrays.toString(numList2));
        }
        if (sorted == false) {
            System.out.println("Array 1 unsorted: " + Arrays.toString(numList1));
            System.out.println("Array 2 unsorted: " + Arrays.toString(numList2));
        }
    }

    public void printQuestion (String question){
        System.out.println(question);
    }
}
