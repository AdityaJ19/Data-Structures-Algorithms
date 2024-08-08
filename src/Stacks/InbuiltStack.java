package Stacks;

import java.util.Stack;

public class InbuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
//Stack- LIFO or FILO
        stack.push(23);
        stack.push(12);
        stack.push(34);
        stack.push(42);
        stack.push(45);
//pop function will return the integer value
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //throws emptyStack Exception if there are no
        //items present in the stack and we call the pop function
    }
}
