package day51;

public class PalindromeLinkedList_234 {
    static void main() {
        ListNode l=new ListNode(1);
        l.next=new ListNode(2);
        l.next.next=new ListNode(3);
        l.next.next.next=new ListNode(2);
        l.next.next.next.next=new ListNode(1);
        System.out.println(isPalindrome(l));
    }
//    private static void printList(ListNode head){
//        while (head!=null){
//            System.out.print(head.data+"->");
//            head=head.next;
//        }
//    }
    public static boolean isPalindrome(ListNode head){
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        while (slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        ListNode fir=head;
        ListNode sec=prev;
        while (sec!=null){
            if (fir.data!=sec.data){
                return false;
            }
            fir=fir.next;
            sec=sec.next;
        }
        return true;
    }
}
class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
    }
}
