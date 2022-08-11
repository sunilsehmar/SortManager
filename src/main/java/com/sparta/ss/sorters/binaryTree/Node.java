package com.sparta.ss.sorters.binaryTree;

public class Node {
    // value will not change since it's the node
    private final int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node right) {
        this.rightChild = right;
    }

    public boolean isLeftChildEmpty(){
        if (leftChild == null){
            return true;
        } else {
            return false;
        }
    }
    public boolean isRightChildEmpty(){
        if (rightChild == null){
            return true;
        } else {
            return false;
        }
    }
}
