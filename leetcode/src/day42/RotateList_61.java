package day42;

public class RotateList_61 {
    static void main() {
        ListNode l=new ListNode(1);
        l.next=new ListNode(2);
        l.next.next=new ListNode(3);
        l.next.next.next=new ListNode(4);
        l.next.next.next.next=new ListNode(5);
        ListNode res=rotate(l,2);
        printList(res);
    }
    public static ListNode rotate(ListNode head,int k){
        if (head==null || head.next==null || k==0){
            return head;
        }
        ListNode cur=head;
        int n=1;
        while (cur.next!=null){
            cur=cur.next;
            n++;
        }
        k=k%n;
        if(k==0){
            return head;
        }
        cur.next=head;
        int s=n-k;
        ListNode newt=head;
        for(int i=1;i<s;i++){
            newt=newt.next;
        }
        ListNode newh=newt.next;
        newt.next=null;
        return newh;
    }
    private static void printList(ListNode head){
        while (head!=null){
            System.out.print(head.data+" -> ");
            head=head.next;
        }
        System.out.println("null");
    }
}
class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
    }
}
