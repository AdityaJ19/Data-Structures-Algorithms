package Trees;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {2,4,5,7,8,9,1,3};
        tree.populate(nums);
        tree.display();
    }
}
