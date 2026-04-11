package day27;

public class MergeKSortedLists_23 {

    static void main() {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(7);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(8);

        ListNode l3 = new ListNode(3);
        l3.next = new ListNode(6);
        l3.next.next = new ListNode(9);

        ListNode[] lists = {l1, l2, l3};

        ListNode result = mergeKLists(lists);

        printList(result);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeListsHelp(lists, 0, lists.length - 1);
    }

    private static ListNode mergeListsHelp(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }

        int mid = start + (end - start) / 2;

        ListNode left = mergeListsHelp(lists, start, mid);
        ListNode right = mergeListsHelp(lists, mid + 1, end);

        return merge2Lists(left, right);
    }

    private static ListNode merge2Lists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }
}