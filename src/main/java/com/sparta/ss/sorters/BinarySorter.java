package com.sparta.ss.sorters;

import com.sparta.ss.sorters.binaryTree.BinaryTree;
import com.sparta.ss.sorters.binaryTree.BinaryTreeInter;

public class BinarySorter implements Sorted {

    @Override
    public int[] sortArray(int[] arrays) {
        BinaryTree tree = new BinaryTree(arrays);
        return tree.getSortedTreeAsc();
    }
    @Override
    public String toString() {
        return "BinarySort";
    }
}
