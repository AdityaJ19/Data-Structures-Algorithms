package LinkedLists.CircularLinkedLIst;

public class CyclicLength {
    private Node head;
    private Node tail;
    private int size;

    public CyclicLength() {
        this.size = 0;
    }

    private class Node {
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

    //Find the length of cyclic List
    public int cyclicLen(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                }
                while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public Node detectCycle(Node head) {
        int length = 0;
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = cyclicLen(slow);
                break;
            }
        }

        if (length == 0){
            return null;
        }
        //Find the start node
        Node f = head;
        Node s = head;
        while (length > 0) {
            s = s.next;
            length--;
        }
        //keep moving both forward and they will eventually meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }
}