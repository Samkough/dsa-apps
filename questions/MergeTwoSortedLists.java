/*
Merge two sorted linked lists.
*/
public class MergeTwoSortedLists {
    public static ListNode node1;
    public static ListNode node2;
    public static ListNode node3;

    public static class ListNode {
        int val;
        ListNode next;
    
        public ListNode(int x) { 
            val = x;
        }
    }

    public static ListNode mergeSortedLists (ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode prev = l3;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l3.next = l1;
                l1 = l1.next;
            } else {
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }

        if (l1 != null) {
            l3.next = l1;
        } else {
            l3.next = l2;
        }

        return prev.next;
    }

    public static void printList(ListNode node) { 
        while (node != null) { 
            System.out.print(node.val + " "); 
            node = node.next; 
        }
        System.out.println("\n");
    }

    public static void main (String args[]) {
        MergeTwoSortedLists.node1 = new ListNode(1); 
        MergeTwoSortedLists.node1.next = new ListNode(2); 
        MergeTwoSortedLists.node1.next.next = new ListNode(4);
        MergeTwoSortedLists.node1.next.next.next = new ListNode(8);
        MergeTwoSortedLists.node2 = new ListNode(1); 
        MergeTwoSortedLists.node2.next = new ListNode(3); 
        MergeTwoSortedLists.node2.next.next = new ListNode(4); 
        MergeTwoSortedLists.node2.next.next.next = new ListNode(7); 
        MergeTwoSortedLists.node2.next.next.next.next = new ListNode(8);
        MergeTwoSortedLists.node2.next.next.next.next.next = new ListNode(10);
  
        System.out.println("First Linked List:"); 
        MergeTwoSortedLists.printList(node1);

        System.out.println("Second Linked List:"); 
        MergeTwoSortedLists.printList(node2);

        node3 = MergeTwoSortedLists.mergeSortedLists(node1, node2); 

        System.out.println("\nMerged List:"); 
        MergeTwoSortedLists.printList(node3); 
    }
}