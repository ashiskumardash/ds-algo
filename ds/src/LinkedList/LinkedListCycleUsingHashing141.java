package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleUsingHashing141 {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        ListNode pointer = head.next;
        Set<ListNode> data = new HashSet<>();
        while (pointer != null){
            if(!data.add(pointer)){
                return true;
            }
            pointer = pointer.next;
        }
        return false;
    }
}
