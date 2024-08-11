package Trees.Traversals;

public class Pre_Order {
    public class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue(int value) {
            return value;
        }
    }
    //Time Complexity = O(N)
    private Node root;

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if (node == null){
            return;
        }
        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}
