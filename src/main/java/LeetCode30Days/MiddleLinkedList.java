package LeetCode30Days;

class ListNode {
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }
}

public class MiddleLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = middleNode(head);
    }

    public static ListNode middleNode(ListNode head) {
        int count = 0;

        ListNode h = head;

        while(head != null){
            count++;
            head = head.next;
        }

        int middle = count/2;

        while(h != null && middle > 0){
            middle--;
            h = h.next;
        }

        return h;
    }
}
