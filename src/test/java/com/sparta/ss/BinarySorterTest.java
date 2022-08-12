package com.sparta.ss;

import com.sparta.ss.sorters.BinarySorter;
import com.sparta.ss.sorters.BinarySorterDesc;
import com.sparta.ss.sorters.BubbleSort;
import com.sparta.ss.sorters.binaryTree.BinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySorterTest {
    BinarySorter binaryTree = new BinarySorter();

    @Test
    @DisplayName("Binary Tree Ascend Testing")
    public void binaryTreeSorterAsc(){

        int[] ar1 = {23, 76, 12, 88, 44};
        int[] ar2 = {50, 40, 30, 20, 10};
        int[] ar3 = {10, 20, 30, 40, 50};

        int[] ar1Sorted = {12, 23, 44, 76, 88};
        int[] ar2Sorted = {10, 20, 30, 40, 50};
        int[] ar3Sorted = {10, 20, 30, 40, 50};

        Assertions.assertArrayEquals(ar1Sorted, binaryTree.sortArray(ar1));
        Assertions.assertArrayEquals(ar2Sorted, binaryTree.sortArray(ar2));
        Assertions.assertArrayEquals(ar3Sorted, binaryTree.sortArray(ar3));

    }

    BinarySorterDesc binarySorterDesc = new BinarySorterDesc();

    @Test
    @DisplayName("Binary Tree Descend Testing")
    public void binaryTreeSorterDesc(){

        int[] ar1 = {23, 76, 12, 88, 44};
        int[] ar2 = {10, 20, 30, 40, 50};
        int[] ar3 = {10, 20, 30, 40, 50};

        int[] ar1Sorted = {88, 76, 44, 23, 12};
        int[] ar2Sorted = {50, 40, 30, 20, 10};
        int[] ar3Sorted = {50, 40, 30, 20, 10};

        Assertions.assertArrayEquals(ar1Sorted, binarySorterDesc.sortArray(ar1));
        Assertions.assertArrayEquals(ar2Sorted, binarySorterDesc.sortArray(ar2));
        Assertions.assertArrayEquals(ar3Sorted, binarySorterDesc.sortArray(ar3));

    }
}
