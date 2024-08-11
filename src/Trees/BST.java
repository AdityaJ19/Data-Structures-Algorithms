package Trees;

public class BST {
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

    public BST(){

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

    //insert the value
    public void insert(int value){
        root = insert(value, root);
    }
    private Node insert(int value, Node node){
        if (node == null){
            //if the node is null then create a new node to
            //insert the value and then return that inserted value
            //otherwise the same node will be returned
            node = new Node(value);
            return node;
        }
        //to insert the value in the left side of side
        if (value < node.value){
           node.left = insert(value, node.left);
        }
        //to insert the value in the right side of side
        if (value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(getHeight(node.left) , getHeight(node.right)) + 1;
        return node;
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }

    // what if we get the sorted array then we do this
    //we take the middle element and then call for left and right part
    //and in those parts again find the middle element and insert it W.R.T the previous mid element
    private void poplulateSorted(int[] nums, int start, int end){
        if (start >= end){
            return;
        }
        int mid = (start + end) /2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }
    private void populateSorted(int[] nums, int i, int end) {

    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if (node == null){
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    //display
    public void display(){
        display(this.root, "Root Node: ");
    }
    private void display(Node node, String details){
        if (node == null){
            return;
        }
        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }
}
