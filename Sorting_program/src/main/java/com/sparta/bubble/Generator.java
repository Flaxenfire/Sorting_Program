package com.sparta.bubble;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class Generator {

    public static Logger logger = LogManager.getLogger("My Logger");

    public int[] generate(int input) {
        try{
            int[] numList = new int[input];
            int min = 1;
            int max = 1000;
            Random rand = new Random();

            for (int i = 0; i < input; i++) {
                numList[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
            }
            return numList;
        }
        catch(Exception e){
            logger.error("Array creation error");
            int [] backup = {10,9,8,7,6,5,4,3,2,1};
            return backup;
        }
    }


}
