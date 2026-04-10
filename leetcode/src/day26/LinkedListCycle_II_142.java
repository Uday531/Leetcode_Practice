package day26;

import java.util.HashSet;

public class LinkedListCycle_II_142 {
    static void main() {
        ListNode l=new ListNode(1);
        l.next=new ListNode(2);
        l.next.next=new ListNode(3);
        l.next.next.next=new ListNode(4);
        l.next.next.next.next=new ListNode(5);
        l.next.next.next.next.next=l.next.next.next.next;
        System.out.println(detectCycle(l));
    }
    public static ListNode detectCycle(ListNode head){
        ListNode sptr=head;
        ListNode fptr=head;
        while (sptr!=null && fptr!=null && fptr.next!=null){
            sptr=sptr.next;
            fptr=fptr.next.next;
            if(sptr==fptr){
                fptr=head;
                while (fptr!=sptr){
                    fptr=fptr.next;
                    sptr=sptr.next;
                }
                return sptr;
            }
        }
        return null;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}
