package LinkedLists.SInglyLinkedList;

public class LL {
    private ListNode head;
    private ListNode tail;
    private int size;

    public LL() {
        this.size = 0;
    }
//Insertion in the LinkedList at the ahead of head
    public void insertFirst(int value){
        ListNode listNode = new ListNode(value);
        listNode.next = head;
        head = listNode;

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
        ListNode listNode = new ListNode(value);
        tail.next = listNode;
        tail = listNode;
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
            ListNode temp = head;
            for (int i = 1; i < index ; i++) {
                temp = temp.next;
            }
            ListNode listNode = new ListNode(value, temp.next);
            temp.next = listNode;
            size++;
        }
    }

    //Insertion using Recursion
    public void insertRec(int value, int index){
        head = insertRec(value, index, head);
    }
    private ListNode insertRec(int value, int index, ListNode listNode){
        if (index == 0){
            ListNode temp = new ListNode(value, listNode);
            size++;
            return temp;
        }
        listNode.next = insertRec(value, index-1, listNode.next);
        return listNode;
    }

    //Display the members of LinkedList
    public void display(){
        ListNode temp = head;
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
        ListNode secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }
    public ListNode get(int index){
        ListNode listNode = head;
        for (int i = 0; i < index; i++) {
            listNode = listNode.next;
        }
        return listNode;
    }

    //Delete at Particular index in List
    public int deleteAtIndex(int index){
        if (index == 0){
            return deleteAtFirst();
        } else if (index == size -1) {
            return deleteAtLast();
        }
        else{
            ListNode prev = get(index - 1);
            int value = prev.next.value;

            prev.next = prev.next.next;
            return value;
        }
    }

    //Find the value of Node
    public ListNode find(int value){
        ListNode listNode = head;
        while(listNode != null){
            if (listNode.value == value){
                return listNode;
            }
            listNode = listNode.next;
        }
        return null;
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


    //Remove the duplicate elements from a sorted list
    public void duplicate(){
        ListNode listNode = head;
        while(listNode.next != null){
            if (listNode.value == listNode.next.value){
                listNode.next = listNode.next.next;
                size--;
            }
            else{
                listNode = listNode.next;
            }
        }
        tail = listNode;
        tail.next = null;
    }

    //Merge the two list in the sorted order
    public static  LL merge(LL first, LL second){
        ListNode f = first.head;
        ListNode s = second.head;
        LL ans = new LL();

        while(f != null && s != null){
            if (f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while(f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s != null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }
}
