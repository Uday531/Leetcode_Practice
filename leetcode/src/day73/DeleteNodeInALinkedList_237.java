package day73;

import day72.MiddleOfALinkedList_876;

public class DeleteNodeInALinkedList_237 {
    public static void deleteNode(MiddleOfALinkedList_876.ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;

    }

    static void main() {
        MiddleOfALinkedList_876.ListNode l1=new MiddleOfALinkedList_876.ListNode(1);
//        System.out.println(deleteNode(l1));
    }
}
