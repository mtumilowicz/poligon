package problems.lists;

/**
 * Created by mtumilowicz on 2017-10-09.
 */
public class ListReverseIterative {
    public static ListNode reverse(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }

        return newHead;
    }
}
