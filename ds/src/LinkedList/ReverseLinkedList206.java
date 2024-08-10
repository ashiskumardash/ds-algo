package LinkedList;

public class ReverseLinkedList206 {
    public static void main(String[] args) {

    }
    // Given the head of a list, reverse the list and return the
    // head of reversed list
    public ListNode reverseList(ListNode head) {
        ListNode cur = head, prev = null, next;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;

        }

        return prev;
    }

}



