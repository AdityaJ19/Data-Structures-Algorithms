package Stacks;

public class CustomStack {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack();

        stack.push(23);
        stack.push(22);
        stack.push(32);
        stack.push(12);
        stack.push(21);
        
        System.out.println();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
    //Stacks are just stored in arrays
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    //for Insertion pointer is at -1 position so when we insert the element pointer++
    //pointer defines the index at which we are at
    int ptr = -1;
    //Constructor with no argument will call the function with the DEFAULT_SIZE
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }
    //for insertion of element
    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is empty can not remove an element");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is empty can not peek an element");
        }
        return data[ptr];
    }
    public boolean isFull() {
        //when pointer is at last index
        return ptr == data.length -1;
    }
    public boolean isEmpty(){
        //when pointer is at first index
        return ptr == -1;
    }
}
