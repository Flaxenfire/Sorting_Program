package com.sparta.bubble;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Starter {
    public static Logger logger = LogManager.getLogger("My Logger");

    Printer printer = new Printer();
    Generator generator = new Generator();

    private int input;


    public Starter(int input) {

        this.input = input;
        int [] numList1 = generator.generate(input);
        int [] numList2 = generator.generate(input);
        int [] sorted1 = new int[0];
        int [] sorted2 = new int[0];
        long startTime;
        long endTime;
        long totalTime1 = 0;
        long totalTime2 = 0;
        printer.print(numList1, numList2, false);
        printer.space();
        boolean valid = false;
        while (valid == false){
            try{
                printer.printQuestion("Which sorter would you like to use for your first sort? (1 - Bubble sort, 2 - Merge sort, 3 - Tree sort");
                Scanner sc1 = new Scanner(System.in);
                String sorter = sc1.nextLine();
                switch (sorter){
                    case "1":
                        Sorter bubbleSort1 = new Bubble_sort(numList1);
                        startTime = System.nanoTime();
                        sorted1 = bubbleSort1.sortArray(numList1);
                        endTime = System.nanoTime();
                        totalTime1 = endTime - startTime;
                        printer.printTime(totalTime1, "Bubble");
                        valid = true;
                        logger.info("First sort bubble");
                        break;
                    case "2":
                        Sorter mergeSort1 = new Merge_sort(numList1);
                        startTime = System.nanoTime();
                        sorted1 = mergeSort1.sortArray(numList1);
                        endTime = System.nanoTime();
                        totalTime1 = endTime - startTime;
                        printer.printTime(totalTime1, "Merge");
                        valid = true;
                        logger.info("First sort merge");
                        break;
                    case "3":
                        Sorter treeSort1 = new Tree_sort(numList1);
                        startTime = System.nanoTime();
                        sorted1 = treeSort1.sortArray(numList1);
                        endTime = System.nanoTime();
                        totalTime1 = endTime - startTime;
                        printer.printTime(totalTime1, "Binary Tree");
                        valid = true;
                        logger.info("First sort tree");
                        break;
                    default:
                        break;
                }
            }
            catch (Exception e){
                e.printStackTrace();
                valid = false;
                logger.error("Input exception found on first sort");
            }

        }
        printer.space();
        valid = false;
        while (valid == false){
            try{
                printer.printQuestion("Which sorter would you like to use for your second sort? (1 - Bubble sort, 2 - Merge sort, 3 - Tree sort");
                Scanner sc1 = new Scanner(System.in);
                String sorter = sc1.nextLine();
                switch (sorter){
                    case "1":
                        Sorter bubbleSort2 = new Bubble_sort(numList2);
                        startTime = System.nanoTime();
                        sorted2 = bubbleSort2.sortArray(numList2);
                        endTime = System.nanoTime();
                        totalTime2 = endTime - startTime;
                        printer.printTime(totalTime2, "Bubble");
                        valid = true;
                        logger.info("Second sort bubble");
                        break;
                    case "2":
                        Sorter mergeSort2 = new Merge_sort(numList2);
                        startTime = System.nanoTime();
                        sorted2 = mergeSort2.sortArray(numList2);
                        endTime = System.nanoTime();
                        totalTime2 = endTime - startTime;
                        printer.printTime(totalTime2, "Merge");
                        valid = true;
                        logger.info("Second sort merge");
                        break;
                    case "3":
                        Sorter treeSort2 = new Tree_sort(numList2);
                        startTime = System.nanoTime();
                        sorted2 = treeSort2.sortArray(numList2);
                        endTime = System.nanoTime();
                        totalTime2 = endTime - startTime;
                        printer.printTime(totalTime2, "Binary Tree");
                        valid = true;
                        logger.info("Second sort tree");
                        break;
                    default:
                        break;
                }
            }
            catch (Exception e){
                e.printStackTrace();
                valid = false;
                logger.error("Input exception found on second sort");
            }
        }
        printer.space();
        printer.print(sorted1, sorted2, true);
        printer.space();
        logger.info("Sorted arrays printed");
        if (totalTime1 > totalTime2){
            printer.speed((totalTime1 - totalTime2), "Sort 2", "Sort 1");
            logger.info("Second sort faster");
        }
        if (totalTime2 > totalTime1){
            printer.speed((totalTime2 - totalTime1), "Sort 1", "Sort 2");
            logger.info("First sort faster");
        }
        else {
            printer.sameSpeed();
            logger.info("Both sorts same speed");
        }

    }
}
