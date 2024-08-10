package array;

public class AddTwoNumbers2 {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode result = new ListNode() {};
        int carryOver = 0;
        while(node1.next!= null || node2.next != null) {
            int sum = carryOver + node1.val + node2.val;
            result.val = sum/10;
            carryOver = sum % 10;
            node2 = node2.next;
            node1 = node1.next;
            result.next = new ListNode() {};
        }

        return result;
    }

}



 // Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
