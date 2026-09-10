package day73;

public class RemoveLinkedListElements_203 {
    static void main() {
        Node l1=new Node(1);
        l1.next=new Node(2);
        l1.next.next=new Node(3);
        int b=2;
        System.out.println(removeListElements(l1,b));
    }
    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static Node removeListElements(Node head,int val){
        while(head!=null && head.next!=null){
            head=head.next;
        }
        Node curr=head;
        while(curr!=null && curr.next!=null){
            if (curr.next.val==val){
                curr.next=curr.next.next;
            }
            else {
                curr=curr.next;
            }
        }
        return head;
    }
}
