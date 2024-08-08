package LinkedLists.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DLL list = new DLL();
        list.insertAtFirst(3);
        list.insertAtFirst(5);
        list.insertAtFirst(7);
        list.insertAtFirst(9);
        list.insertAtFirst(11);

        list.display();
        list.insertAtLast(23);
        list.display();

        list.insertAfter(9, 10);
        list.display();

    }
}
