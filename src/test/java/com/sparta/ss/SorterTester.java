package com.sparta.ss;

import com.sparta.ss.sorters.*;
import com.sparta.ss.start.SortLoader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class SorterTester {
    Sorted bubbleSorter = new BubbleSort();
    Sorted mergeSorter = new MergeSort();
    Sorted binarySorterAscending = new BinarySorter();
    Sorted binarySorterDescending = new BinarySorterDesc();
    Sorted quickSorter = new QuickSorter();

    @Test
    @DisplayName("Testing All Sorters")
    public void testAllSorters() {

        int[] randomArray = SortLoader.createArray(100);
        int[] correctArray = Arrays.copyOf(randomArray, randomArray.length);
        int[] correctArrayReversed = Arrays.copyOf(randomArray, randomArray.length);

        // correct array
        Arrays.sort(correctArray);

        // correct array just reversed (for binary sort in descending order)
        Arrays.sort(correctArrayReversed);
        Collections.reverse(Arrays.asList(correctArrayReversed));

        // test against the built-in array sorting method
        Assertions.assertArrayEquals(correctArray, bubbleSorter.sortArray(randomArray));
        Assertions.assertArrayEquals(correctArray, mergeSorter.sortArray(randomArray));
        //Assertions.assertArrayEquals(correctArrayReversed, binarySorterDescending.sortArray(randomArray));
        Assertions.assertArrayEquals(correctArray, binarySorterAscending.sortArray(randomArray));
        Assertions.assertArrayEquals(correctArray, quickSorter.sortArray(randomArray));
    }
}
