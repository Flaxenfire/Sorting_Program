package com.sparta.bubble;

import java.util.Arrays;

public class Bubble_sort implements Sorter {

    private int [] numList;

    public Bubble_sort (int [] numList){
        this.numList = numList;
    }

    public Bubble_sort() {

    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        int temp = 0;
        int count = 1;
        while (count > 0){
            count = 0;
            for (int i = 0; i < (arrayToSort.length)-1; i++){
                if (arrayToSort [i] > arrayToSort [i+1]){
                    temp = arrayToSort [i+1];
                    arrayToSort [i+1] = arrayToSort [i];
                    arrayToSort [i] = temp;
                }
            }
            for (int i = 0; i < (arrayToSort.length)-1; i++){
                if (arrayToSort [i] > arrayToSort [i+1]){
                    count++;
                }
            }
        }
        return arrayToSort;
    }

}
