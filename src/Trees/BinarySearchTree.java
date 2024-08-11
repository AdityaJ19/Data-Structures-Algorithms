package Trees;

import java.util.Scanner;

public class BinarySearchTree {
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue(int value) {
            return value;
        }
    }
    private Node root;

    public BinarySearchTree(){

    }
    // check for get height of the node
    public int getHeight(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }
    //check for the tree is empty
    public boolean isEmpty(){
        return root == null;
    }
    //display
    public void display(){
        display(root, "Root Node: ");
    }
    private void display(Node node, String details){
        if (node == null){
            return;
        }
        System.out.println(details + node.getValue(node.value));

        display(node.left, "Left child of " + node.getValue(node.value) + " : ");
        display(node.right, "Right child of " + node.getValue(node.value) + " : ");
    }
}
