package day72;

public class DesignLinkedList_707 {
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    Node head;
    public DesignLinkedList_707() {
        head=null;
    }
    public int get(int index) {
        Node current=head;
        for(int i=0;i<index;i++){
            if(current==null){
                return -1;
            }
            current=current.next;
        }
        if(current==null){
            return -1;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        Node newnode=new Node(val);
        newnode.next=head;
        head=newnode;
    }

    public void addAtTail(int val) {
        Node current=head;
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return;
        }
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
    }

    public void addAtIndex(int index, int val) {
        if(index<0){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        Node current=head;
        for(int i=0;i<index-1;i++){
            if (current == null) {
                return;
            }
            current=current.next;
        }
        if (current == null) {
            return;
        }
        Node newnode=new Node(val);
        newnode.next=current.next;
        current.next=newnode.next;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || head==null){
            return;
        }
        if(index==0){
            head=head.next;
            return;
        }
        Node current=head;
        for(int i=0;i<index-1;i++){
            if(current==null){
                return;
            }
            current=current.next;
        }
        if(current==null || current.next==null){
            return;
        }
        current.next=current.next.next;
    }
    static void main() {
        DesignLinkedList_707 l1=new DesignLinkedList_707();
        l1.addAtHead(1);
        l1.get(0);
    }
}
