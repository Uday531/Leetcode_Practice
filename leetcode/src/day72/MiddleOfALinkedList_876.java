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
    public static class ListNode{
        ListNode head;
        public ListNode next;
        public int val;
        public ListNode(int val){
            this.val=val;
        }
    }
}
