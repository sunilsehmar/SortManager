package com.sparta.ss.display;
import com.sparta.ss.sorters.BubbleSort;
import com.sparta.ss.sorters.QuickSorter;
import com.sparta.ss.sorters.MergeSort;
import com.sparta.ss.sorters.Sorted;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayManager {

    public static ArrayList<String> getMenuItems() {
        return new ArrayList<>(Arrays.asList(
                "BinarySorter",
                "BubbleSorter",
                "MergeSorter",
                "QuickSorter"
        ));
    }

    public static void printBeforeSort(Sorted sorter, int[] arrayToSort) {
        System.out.println("Sorting using the " + sorter);
        System.out.println("Before sorting:\n" + Arrays.toString(arrayToSort));
    }

    public static void printResults(Sorted sorter, int[] arrayToSort) {
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(arrayToSort);
        System.out.println("After sorting:\n" + Arrays.toString(sortedArray));
        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - start) + "nanoseconds");
    }

    public static void displaySortChoice() {
        System.out.println("Enter the number of the sorter you wish to use");
        for (int i = 0; i < getMenuItems().size(); i++) {
            System.out.println(i + 1 + ". " + getMenuItems().get(i));
        }
    }
}
