package Queues;

public class CustomQueue {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.insert(23);
        queue.insert(12);
        queue.insert(32);
        queue.insert(43);
        queue.insert(34);

        queue.display();

    }
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    //first add the item then increase it
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        //when pointer is at last index
        return end == data.length;
    }

    public boolean isEmpty() {
        //when pointer is at first index
        return end == 0;
    }

    //for insertion in queue
    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }

    // for removal we just remove the first index element and then
    // left shift the current queue by 1
    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("End");
    }
}
