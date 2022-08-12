package com.sparta.ss.sorters;

import java.util.logging.Level;
import java.util.logging.Logger;

public class QuickSorter implements Sorted{

    private static final Logger logger = Logger.getLogger("my logger");
    @Override
    public int[] sortArray(int[] arrays) {
        return quickSort(arrays, 0, arrays.length -1);
    }

    public int[] quickSort(int[] arr, int begin, int end) {
        logger.log(Level.INFO, "sorts the given array");
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
        return arr;
    }

    private int partition(int arr[], int begin, int end) {
        logger.log(Level.INFO, "runs through each element, then uses swap to sort the array");
        int pivot = arr[end];
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        return i+1;
    }

    @Override
    public String toString() {
        return "QuickSorter";
    }
}
