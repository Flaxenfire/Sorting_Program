package com.sparta.bubble;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {

    public static Logger logger = LogManager.getLogger("My Logger");

    public static void main (String [] args){

        Printer printer = new Printer();
        int input = 0;
        while (input < 10 || input > 100 ){
            try {
                printer.printQuestion("Please input a number between 10 and 100:");
                Scanner sc1 = new Scanner(System.in);
                String inputStr = sc1.nextLine();
                String inputStr2 = inputStr.replaceAll("[^0-9]", "0");
                input = Integer.parseInt(inputStr2);
            }
            catch (NumberFormatException e){
                e.printStackTrace();
                input = 0;
                logger.info("Number out of int range");
            }
            catch (Exception e){
                e.printStackTrace();
                input = 0;
                logger.info("Other input exception");
            }
        }
        Starter starter = new Starter(input);
    }
}
