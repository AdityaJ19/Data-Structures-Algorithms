package LinkedLists.DoublyLinkedList;

import org.w3c.dom.Node;

public class DLL {

   private Node head;
   private Node tail;

    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertAtLast(int value) {
        Node node = new Node(value);

        //CASE-1
//        if (tail == null) {
//            insertAtFirst(value);
//            return;
//        } else {
//            node.prev = tail;
//            node.next = null;
//            if (tail != null){
//                tail.next = node;
//            }
//            tail = node;
//        }

        //CASE-2
        Node last = head;
        node.next = null;

        if (head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //Insertion after a particular value
    public void insertAfter(int after, int value){
        Node p = find(after);
        //what if the node p doesn't exist
        if (p == null){
            System.out.println("Doesn't exist");
        }
        //create a new Node
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null){
            node.next.prev = node;
        }
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value + "->");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse");
        while(last != null){
            System.out.print(last.value + "->");
            last = last.prev;
        }
        System.out.println("START");
    }


    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
