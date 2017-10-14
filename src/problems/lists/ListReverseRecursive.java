package problems.lists;

/**
 * Created by mtumilowicz on 2017-10-09.
 */
public class ListReverseRecursive {
    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode listNode = reverse(head.next);

        head.next.next = head;
        head.next = null;

        return listNode;
    }

    public void empty() {

    }
}