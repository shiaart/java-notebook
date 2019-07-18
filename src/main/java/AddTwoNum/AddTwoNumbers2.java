package AddTwoNum;

public class AddTwoNumbers2 {

    public static void main(String[] args){
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(3);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);

        ListNode r = addTwoNumbers(list1, list2);
        System.out.println(r.val + " -> " + r.next.val+ " -> " + r.next.next.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
