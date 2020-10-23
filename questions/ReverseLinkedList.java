package questions;

/*
Reverse a singly linked list.
*/
public class ReverseLinkedList {
    public static ListNode head;

    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int x) {
            data = x;
        }
    }

    // O(n)
    public static ListNode reverseLinkedListIteratively(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String args[]) {
        ReverseLinkedList.head = new ListNode(85);
        ReverseLinkedList.head.next = new ListNode(15);
        ReverseLinkedList.head.next.next = new ListNode(4);
        ReverseLinkedList.head.next.next.next = new ListNode(20);

        System.out.println("Given Linked List:");
        ReverseLinkedList.printList(head);

        head = ReverseLinkedList.reverseLinkedListIteratively(head);

        System.out.println("\nReversed Linked List:");
        ReverseLinkedList.printList(head);
    }
}