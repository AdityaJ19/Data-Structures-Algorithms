package LinkedLists.SInglyLinkedList;

import LinkedLists.DoublyLinkedList.DLL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(9);
        list.insertLast(11);
        list.insertAtIndex(13,3);
        list.display();
        System.out.println(list.deleteAtFirst());
        list.display();
        System.out.println(list.deleteAtLast());
        list.display();
        System.out.println(list.deleteAtIndex(2));
        list.display();

    }
}
