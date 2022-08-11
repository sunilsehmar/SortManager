package com.sparta.ss.sorters;

import java.io.IOException;
import java.util.logging.*;

public class BubbleSort implements Sorted {
    private static final Logger logger = Logger.getLogger("my logger");
    private  static ConsoleHandler consoleHandler = new ConsoleHandler();

    @Override
    public int[] sortArray(int[] arrays) {
        //logger.log(Level.INFO, "Calls the method below");
        //consoleHandler.setFormatter();
        return oneIterationSort(arrays);
    }

    public static int[] oneIterationSort(int[] search) {
        int temp;
        //logger.log(Level.INFO, "for loop runs the array");
        for (int i = 0; i < search.length; i++) {
            for (int elememt = 0; elememt < search.length - 1; elememt++) {
                if (search[elememt] > search[elememt + 1]) {
                    temp = search[elememt];
                    search[elememt] = search[elememt + 1];
                    search[elememt + 1] = temp;
                }
            }
        }
        //logger.log(Level.INFO, "This is an info messeage");
        return search;
    }

    @Override
    public String toString() {
        return "BubbleSort";
    }
}

