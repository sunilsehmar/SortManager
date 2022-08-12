package com.sparta.ss.sorters;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MergeSort implements Sorted {

    private static final Logger logger = Logger.getLogger("my logger");


    @Override
    public int[] sortArray(int[] arrays) {
        mergeSort(arrays, arrays.length);
        return arrays;
    }

    public static void mergeSort(int[] a, int number) {
        logger.log(Level.INFO, "method splits the array using merge sorting");
        // if n is 1
        if (number < 2) {
            return;
        }

        int midPoint = number / 2;

        int[] l = new int[midPoint];
        int[] r = new int[number - midPoint];

        for (int i = 0; i < midPoint; i++) {
            l[i] = a[i];
        }

        for (int i = midPoint; i < number; i++) {
            r[i - midPoint] = a[i];
        }
        mergeSort(l, midPoint);
        mergeSort(r, number - midPoint);
        merge(a, l, r, midPoint, number - midPoint);

    }
    public static void merge( int[] a, int[] l, int[] r, int left, int right) {
        logger.log(Level.INFO, "method merges the merger sort method");

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    @Override
    public String toString() {
        return "MergeSort";
    }
}


