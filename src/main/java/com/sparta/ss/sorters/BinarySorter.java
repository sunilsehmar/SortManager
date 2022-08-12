package com.sparta.ss.sorters;

import com.sparta.ss.sorters.binaryTree.BinaryTree;
import com.sparta.ss.sorters.binaryTree.BinaryTreeInter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BinarySorter implements Sorted {

    private static final Logger logger = Logger.getLogger("my logger");

    @Override
    public int[] sortArray(int[] arrays) {
        BinaryTree tree = new BinaryTree(arrays);
        logger.log(Level.INFO, "returns Ascending method from binary tree");
        return tree.getSortedTreeAsc();
    }
    @Override
    public String toString() {
        return "BinarySortAsc";
    }
}
