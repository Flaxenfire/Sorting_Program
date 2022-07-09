package com.sparta.bubble;

import java.util.Arrays;

public class Bubble_sort implements Sorter {

    private int [] numList;
    //private int [] comList;
    //private int [] numList1;
    //private int [] numList2;

    public Bubble_sort (int [] numList){
        this.numList = numList;
    }

    public Bubble_sort() {

    }

    /*public Bubble_sort (int [] numList1, int [] numList2){
        this.numList1 = numList1;
        this.numList2 = numList1;
        int [] merged = this.mergeArray(numList1, numList2);
        int [] sorted = this.sortArray(merged);
        System.out.println("Both sorted arrays combined and sorted again: " + Arrays.toString(merged));
    }*/

    @Override
    public int[] sortArray(int[] arrayToSort) {
        int temp = 0;
        int count = 1;
        //System.out.println(Arrays.toString(arrayToSort));
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

    /*@Override
    public int[] mergeArray(int[] arrayToMerge1, int [] arrayToMerge2) {
        int x = arrayToMerge1.length + arrayToMerge2.length;
        int [] merged = new int [x];
        int base = 0;
        for (int i = 0; i < arrayToMerge1.length; i++){
            merged [i] = arrayToMerge1[i];
            base ++;

        }
        for (int i = 0; i < arrayToMerge2.length; i++){
            merged [base + i] = arrayToMerge2[i];
        }
        return merged;
    }*/
}
