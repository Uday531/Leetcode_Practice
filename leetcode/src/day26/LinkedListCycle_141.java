package day26;

import java.util.HashMap;
import java.util.HashSet;

public class LinkedListCycle_141 {
    static void main() {
        ListNode l=new ListNode(1);
        l.next=new ListNode(2);
        l.next.next=new ListNode(3);
        l.next.next.next=new ListNode(4);
        l.next.next.next.next=new ListNode(5);
        l.next.next.next.next.next=l.next.next.next.next;
        System.out.println(isCycle(l));
    }
    public static boolean isCycle(ListNode head){
//        ListNode dummy=head;
//        HashSet<ListNode> l=new HashSet<>();
//        while (head!=null){
//            if (l.contains(head)){
//                return true;
//            }
//            l.add(head);
//            head=head.next;
//        }
//        return false;
        // 2nd approach
        ListNode sptr=head;
        ListNode fptr=head;
        while(sptr!=null && fptr!=null && fptr.next!=null){
            sptr=sptr.next;
            fptr=fptr.next.next;
            if (sptr==fptr){
                return true;
            }
        }
        return false;
    }
    static class ListNode {
        int val;
        ListNode next;

        // Constructor
        public ListNode(int val) {
            this.val = val;
            this.next=null;
        }
    }
}

