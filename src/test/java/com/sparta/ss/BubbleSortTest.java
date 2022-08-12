package com.sparta.ss;

import com.sparta.ss.sorters.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    BubbleSort bubbleSort = new BubbleSort();

    @Test
    @DisplayName("Bubble Sort Testing")
    public void bubbleSortTest(){

        int[] ar1 = {23, 76, 12, 88, 44};
        int[] ar2 = {10, 20, 30, 40, 50};
        int[] ar3 = {50, 40, 30, 20, 10};

        int[] ar1Sorted = {12, 23, 44, 76, 88};
        int[] ar2Sorted = {53, 54, 55, 56, 57, 58};
        int[] ar3Sorted = {113, 114, 115, 116, 117, 118};

        Assertions.assertArrayEquals(ar1Sorted, bubbleSort.sortArray(ar1));
        //Assertions.assertArrayEquals(ar2Sorted, bubbleSort.sortArray(ar2));
        //Assertions.assertArrayEquals(ar3Sorted, bubbleSort.sortArray(ar3));

    }
}
