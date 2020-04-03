package AddTwoNum;


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class AddTwoNumbers {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2)  {
        int addition = 0;

        ListNode head = new ListNode(0);

        while (l1 != null || l2 != null || addition == 1){

            if(l1 != null && l2 != null) {
                int sum = l1.val + l2.val + addition;
                if (sum >= 10) {
                    insert(head, sum % 10);
                    addition = 1;
                } else {
                    insert(head, sum);
                    addition = 0;
                }

                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1 != null && l2 == null){
                int sum = l1.val + addition;
                if (sum >= 10) {
                    insert(head, sum % 10);
                    addition = 1;
                } else {
                    insert(head, sum);
                    addition = 0;
                }

                l1 = l1.next;
            }
            else if(l1 == null && l2 != null){
                int sum = l2.val + addition;
                if (sum >= 10) {
                    insert(head, sum % 10);
                    addition = 1;
                } else {
                    insert(head, sum);
                    addition = 0;
                }

                l2 = l2.next;
            }
            else {
                insert(head, addition);
                addition = 0;
            }
        }


        return head.next;
    }

    public static  ListNode insert(ListNode head,int data) {
        ListNode conductor = head;
        if(conductor == null){
            head = new ListNode(data);
        }
        else{
            while(conductor.next != null){
                conductor = conductor.next;
            }
            conductor.next = new ListNode(data);
        }
        return head;
    }
}
