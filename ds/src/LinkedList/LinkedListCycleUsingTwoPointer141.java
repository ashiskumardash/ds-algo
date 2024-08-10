package LinkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class LinkedListCycleUsingTwoPointer141 {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        ListNode slowPointer = head, fastPointer = head;
        Set<ListNode> data = new HashSet<>();
        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(slowPointer == fastPointer){
                return true;
            }
        }
        return false;
    }
}
