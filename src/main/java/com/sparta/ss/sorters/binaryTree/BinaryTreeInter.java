package com.sparta.ss.sorters.binaryTree;

public interface BinaryTreeInter {
    int getRootElement();

    int GetNumberOfElements();

    void addElement(int element);

    void addElements(int [] elements);

    boolean findElement(int value);

    //int getLeftChild(int element) throws ChildNotFoundException;

    //int getRightChild(int element) throws ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();


}
