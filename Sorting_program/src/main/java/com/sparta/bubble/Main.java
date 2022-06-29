/*package com.sparta.bubble;

import java.util.Scanner;


public class Main {
    public static void main (String [] args){

        Bubble_sort bubble = new Bubble_sort();

        int input = 0;
        while (input < 10 || input > 100){
            System.out.println("Please input a number between 10 and 100:");
            Scanner sc1 = new Scanner(System.in);
            String a = sc1.nextLine();
            String b = a.replaceAll("[^0-9]", "0");
            input = Integer.parseInt(b);
        }

        int [] numList = new int[input];
        int min = 1;
        int max = 1000;

        for (int i = 0; i < input; i++){
            numList [i] = (int)Math.floor(Math.random()*(max-min+1)+min);
        }
        System.out.println(bubble.sort(numList, input));
    }
}*/
