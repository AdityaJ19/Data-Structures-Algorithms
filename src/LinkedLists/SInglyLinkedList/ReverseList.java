package LinkedLists.SInglyLinkedList;

import java.util.List;

public class ReverseList {
    private ListNode head;
    private ListNode tail;

    //Reverse a LinkedList using Recursion
    public void reverse(ListNode node){
        if (node == tail){
            head = tail;
            return;
        }
        reverse(node);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    //In-place Reversal of LinkedList
    public void reverseInPlace(){
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;
        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null){
                next = next.next;
            }
        }
        head = prev;
    }


    private class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
}
