package com.sparta.ss.sorters.binaryTree;

public class BinaryTree implements BinaryTreeInter {
    private final Node rootNode;
    private int [] sortArrayAsc;
    private int asc;

    public BinaryTree(int elements) {
        rootNode = new Node(elements);
        this.sortArrayAsc = sortArrayAsc;
    }

    public BinaryTree(final int[] array) {
        rootNode = new Node(array[0]);
        for (int i = 1; i < array.length; i++) {
            addElement(array[i]);
        }
    }

    @Override
    public void addElement(final int element){
        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {
        for (int i : elements) {
            addElement(i);
        }
    }

    @Override
    public boolean findElement(int value){
        Node node = findNode(value);
        if (node != null){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public int[] getSortedTreeAsc() {
        asc = 0;
        int [] ArrayAsc = new int[GetNumberOfElements()];
        return returnArrayAsc(ArrayAsc, rootNode);
    }

    public int [] returnArrayAsc(int [] sortedArrayAsc, Node node){

        if (!node.isLeftChildEmpty()){
            returnArrayAsc(sortedArrayAsc, node.getLeftChild());
        }
        sortedArrayAsc[asc++] = node.getValue();

        if (!node.isRightChildEmpty()){
            returnArrayAsc(sortedArrayAsc, node.getRightChild());
        }

        return sortedArrayAsc;
    }

    @Override
    public int[] getSortedTreeDesc() {
        int[] sortedArray = new int[GetNumberOfElements()];
        asc = 0;
        return returnDescendingTree(sortedArray, rootNode);
    }

    private int[] returnDescendingTree(int[] sortedArray, Node node) {

        if (!node.isRightChildEmpty()) {
            returnDescendingTree(sortedArray, node.getRightChild());
        }
        sortedArray[asc ++] = node.getValue();
        if (!node.isLeftChildEmpty()) {
            returnDescendingTree(sortedArray, node.getLeftChild());
        }
        return sortedArray;
    }

    private void addNodeToTree(Node node, int element){
        if (element < node.getValue()){
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getValue()){
            if (node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }

    private Node findNode(int element){
        Node node = rootNode;
        while (node != null){
            if (element == node.getValue()){
                return node;
            }
            if (element < node.getValue()){
                node = node.getLeftChild();
            } else if (element > node.getValue()){
                node = node.getRightChild();
            }
        }
        return null;
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int GetNumberOfElements() {

        // returns the numOfNodes method, with the root node as the parameter, will pass it
        return numOfNodes(rootNode);
    }

    private int numOfNodes(Node rootNode){

        //if the rootNode(first node) has nothing, return 0, since there is no root node
        if (rootNode == null){
            return 0;
        }

        // if there is a root node, the if statement will not execute and will return the statement below
        // return 1 (the root node), the number of left and right children
        return 1 + numOfNodes(rootNode.getLeftChild()) + numOfNodes(rootNode.getRightChild());
    }

}
