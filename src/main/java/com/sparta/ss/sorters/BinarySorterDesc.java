package com.sparta.ss.sorters;

import com.sparta.ss.sorters.binaryTree.BinaryTree;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BinarySorterDesc implements Sorted {

    private static final Logger logger = Logger.getLogger("my logger");

    @Override
    public int[] sortArray(int[] arrays) {
        BinaryTree tree = new BinaryTree(arrays);
        logger.log(Level.INFO, "returns Descending method from binary tree");
        return tree.getSortedTreeDesc();
    }
    @Override
    public String toString() {
        return "BinarySortDesc";
    }
}