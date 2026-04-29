package day38;

public class SortList_148 {
    static void main() {
        ListNode l=new ListNode(1);
        l.next=new ListNode(6);
        l.next.next=new ListNode(4);
        l.next.next.next=new ListNode(3);
        ListNode res=sortList(l);
        printList(res);
    }
    public static ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = getmid(head);
        ListNode rightHead = mid.next;
        mid.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);
        return merge(left, right);
    }
    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    private static ListNode getmid(ListNode head){
        ListNode s=head,f=head.next;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    private static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null) {
            tail.next = l1;
        }
        if (l2 != null) {
            tail.next = l2;
        }
        return dummy.next;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}