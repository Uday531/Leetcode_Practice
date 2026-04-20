package day36;

public class InsertionSortList_147 {
    static void main() {
        ListNode l=new ListNode(1);
        l.next=new ListNode(2);
        l.next.next=new ListNode(3);
        ListNode rs=insertionSortList(l);
        printList(rs);
    }
    public static ListNode insertionSortList(ListNode head){
        if(head==null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }
        return dummy.next;
    }
    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }

}