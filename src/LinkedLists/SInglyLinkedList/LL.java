package LinkedLists.SInglyLinkedList;

import org.w3c.dom.Node;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
//Insertion in the LinkedList at the ahead of head
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail==null){
            tail = head;
        }
        size += 1;
    }
// Insertion at the last of the Linked List
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
    }

    //Insert at any index in LinkedList
    public void insertAtIndex(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        } else if (index == size) {
            insertLast(value);
            return;
        }else {
            Node temp = head;
            for (int i = 1; i < index ; i++) {
                temp = temp.next;
            }
            Node node = new Node(value, temp.next);
            temp.next = node;
            size++;
        }
    }

    //Display the members of LinkedList
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    //Delete of a node at starting of the list
    public int deleteAtFirst(){
        int value = head.value;
        head = head.next;

        if (head == null){
            tail = null;
        }
        size--;
        return value;
    }

    //Delete of a node at last of the List
    public int deleteAtLast(){
        if (size <= 1){
            return deleteAtFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //Delete at Particular index in List
    public int deleteAtIndex(int index){
        if (index == 0){
            return deleteAtFirst();
        } else if (index == size -1) {
            return deleteAtLast();
        }
        else{
            Node prev = get(index - 1);
            int value = prev.next.value;

            prev.next = prev.next.next;
            return value;
        }
    }

    //Find the value of Node
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

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
