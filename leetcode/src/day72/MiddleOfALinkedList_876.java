package day72;

public class MiddleOfALinkedList_876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static void main() {
        ListNode l1=new ListNode(1);
    }
    static class ListNode{
        ListNode head;
        ListNode next;
        int val;
        ListNode(int val){
            this.val=val;
        }
    }
}
