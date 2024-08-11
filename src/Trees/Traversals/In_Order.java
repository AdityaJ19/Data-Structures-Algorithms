package Trees.Traversals;

public class In_Order {
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

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value + " ");
        inOrder(node.right);
    }
}
