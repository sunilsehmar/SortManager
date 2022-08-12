package com.sparta.ss.sorters;

import com.sparta.ss.sorters.binaryTree.BinaryTree;

public class BinarySorterDesc implements Sorted {

    @Override
    public int[] sortArray(int[] arrays) {
        BinaryTree tree = new BinaryTree(arrays);
        return tree.getSortedTreeDesc();
    }
    @Override
    public String toString() {
        return "BinarySortDesc";
    }
}