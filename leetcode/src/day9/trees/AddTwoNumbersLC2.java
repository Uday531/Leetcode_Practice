package day9.trees;

public class AddTwoNumbersLC2 {
    static void main() {
        //1st LL
        Node2 l1=new Node2(2);
        l1.next=new Node2(4);
        l1.next.next=new Node2(3);
        //2nd LL
        Node2 l2 = new Node2(5);
        l2.next = new Node2(6);
        l2.next.next = new Node2(4);
        AddTwoNumbersLC2 obj=new AddTwoNumbersLC2();
        Node2 result=obj.addtwoNumbers(l1,l2);
        while (result != null) {
            System.out.print(result.data + " -> ");
            result = result.next;
        }
    }
    public Node2 addtwoNumbers(Node2 l1,Node2 l2){
        Node2 dummy=new Node2(0);
        Node2 cur=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int x=(l1!=null)? l1.data:0;
            int y=(l2!=null)?l2.data:0;
            int sum=x+y+carry;
            carry=sum/10;
            cur.next=new Node2(sum%10);
            cur=cur.next;
            if (l1!=null)
                l1=l1.next;
            if (l2!=null)
                l2=l2.next;
        }
        return dummy.next;
    }
}
class Node2 {
    int data;
    Node2 next;
    Node2(int data){
        this.data=data;
    }
}
