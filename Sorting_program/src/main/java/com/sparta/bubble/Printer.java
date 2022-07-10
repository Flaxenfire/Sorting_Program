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

    public void printTime (long time, String sorter){
        System.out.println(sorter + " sort took " + time + " milliseconds");
    }

    public void speed (long speed, String fastest, String slowest){
        System.out.println(fastest + " was faster than " + slowest + " by " + speed + " milliseconds");
    }

    public void sameSpeed(){
        System.out.println("Both sorts were the same speed");
    }

    public void space(){
        System.out.println("");
    }
}
