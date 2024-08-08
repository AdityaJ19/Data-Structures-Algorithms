package Heaps;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap01<Integer> heap  =new Heap01<>();

        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);
        System.out.println(heap.remove());
    }
}
