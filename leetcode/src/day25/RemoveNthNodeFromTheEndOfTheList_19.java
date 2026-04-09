package day25;

public class RemoveNthNodeFromTheEndOfTheList_19 {
    static void main() {
        ListNode a=new ListNode(1);
        a.next=new ListNode(2);
        a.next.next=new ListNode(3);
        a.next.next.next=new ListNode(4);
        a.next.next.next.next=new ListNode(5);
        int m=2;
        a=removeNthElement(a,m);
        printList(a);
    }
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static ListNode removeNthElement(ListNode head,int n){
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode fptr=dummy;
        ListNode lptr=dummy;
        for (int i=0;i<n;i++){
            lptr=lptr.next;
        }
        while(lptr.next!=null){
            fptr=fptr.next;
            lptr=lptr.next;
        }
        fptr.next=fptr.next.next;
        return dummy.next;
    }
}
class ListNode {
    public int val;
    public ListNode next;

    // Constructor
    public ListNode(int val) {
        this.val = val;
        this.next=null;
    }
}

