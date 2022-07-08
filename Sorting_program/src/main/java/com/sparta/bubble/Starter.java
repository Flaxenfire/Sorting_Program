package com.sparta.bubble;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Starter {
    public static Logger logger = LogManager.getLogger("My Logger");

    Printer printer = new Printer();

    private int input;
    public Starter(int input) {

        this.input = input;
        int [] numList1 = this.generate(input);
        int [] numList2 = this.generate(input);
        printer.print(numList1, numList2, false);
        boolean valid = false;
        while (valid == false){
            try{
                printer.printQuestion("Which sorter would you like to use for your first sort? (1 - Bubble sort, 2 - Merge sort");
                Scanner sc1 = new Scanner(System.in);
                String sorter = sc1.nextLine();
                switch (sorter){
                    case "1":
                        Sorter bubbleSort1 = new Bubble_sort(numList1);
                        valid = true;
                        break;
                    case "2":
                        Sorter mergeSort1 = new Merge_sort(numList1);
                        valid = true;
                        break;
                    default:
                        break;
                }
            }
            catch (Exception e){
                e.printStackTrace();
                valid = false;
                logger.error("Input exception found");
            }

        }
        valid = false;
        while (valid == false){
            try{
                printer.printQuestion("Which sorter would you like to use for your second sort? (1 - Bubble sort, 2 - Merge sort");
                Scanner sc1 = new Scanner(System.in);
                String sorter = sc1.nextLine();
                switch (sorter){
                    case "1":
                        Sorter bubbleSort2 = new Bubble_sort(numList2);
                        valid = true;
                        break;
                    case "2":
                        Sorter mergeSort2 = new Merge_sort(numList2);
                        valid = true;
                        break;
                    default:
                        break;
                }
            }
            catch (Exception e){
                e.printStackTrace();
                valid = false;
                logger.error("Input exception found");
            }
        }
        printer.print(numList1, numList2, true);
        //Sorter comSort = new Bubble_sort(numList1, numList2);

    }
    // put in new class
    public int[] generate(int input) {
        int[] numList = new int[input];
        int min = 1;
        int max = 1000;
        Random rand = new Random();

        for (int i = 0; i < input; i++) {
            numList[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }
        return numList;
    }
}