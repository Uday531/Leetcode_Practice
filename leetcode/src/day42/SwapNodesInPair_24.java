package day42;

public class SwapNodesInPair_24 {
    static void main() {
        ListNode l=new ListNode(1);
        l.next=new ListNode(2);
        l.next.next=new ListNode(3);
        l.next.next.next=new ListNode(4);
        ListNode res=swapPairs(l);
        printList(res);
    }
    public static ListNode swapPairs(ListNode head){
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy;
        while (cur.next!=null && cur.next.next!=null){
            ListNode first=cur.next;
            ListNode sec=cur.next.next;
            first.next=sec.next;
            sec.next=first;
            cur.next=sec;
            cur=first;
        }
        return dummy.next;
    }
    private static void printList(ListNode head){
        while (head!=null){
            System.out.print(head.data+" -> ");
            head=head.next;
        }
        System.out.println("null");
    }
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
        }
    }
}

