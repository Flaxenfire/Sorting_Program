package com.sparta.bubble;

import java.util.Arrays;

public class Bubble_sort {

    public String sort (int [] numList, int input){

        int temp = 0;
        int count = 1;
        System.out.println(Arrays.toString(numList));
        while (count > 0){
            count = 0;
            for (int i = 0; i < input-1; i++){
                if (numList [i] > numList [i+1]){
                    temp = numList [i+1];
                    numList [i+1] = numList [i];
                    numList [i] = temp;
                }
            }
            for (int i = 0; i < input-1; i++){
                if (numList [i] > numList [i+1]){
                    count++;
                }
            }
        }

        String sorted = (Arrays.toString(numList));
        return sorted;
    }

}