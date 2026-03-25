package day9.trees;

public class MergeTwoLinkedLists {
    static void main() {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        ListNode l2=new ListNode(1);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(5);
        MergeTwoLinkedLists ob=new MergeTwoLinkedLists();
        ListNode k=ob.mergeTwoLL(l1,l2);
        while(k!=null){
            System.out.print(k.data+"->");
            k=k.next;
        }
    }
    public ListNode mergeTwoLL(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        while (l1!=null && l2!=null){
            if (l1.data<=l2.data){
                cur.next=l1;
                l1=l1.next;
            }
            else{
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        if(l1!=null){
            cur.next=l1;
        }else{
            cur.next=l2;
        }
        return dummy.next;
    }
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
        }
    }
}
