package problems.lists;

import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-10-13.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode get3ElementList() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ln1.next = ln2;
        ln2.next = ln3;

        return ln1;
    }

    public static ListNode get10ElementList() {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);
        ListNode ln6 = new ListNode(6);
        ListNode ln7 = new ListNode(7);
        ListNode ln8 = new ListNode(8);
        ListNode ln9 = new ListNode(9);
        ListNode ln10 = new ListNode(10);
        
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ln5.next = ln6;
        ln6.next = ln7;
        ln7.next = ln8;
        ln8.next = ln9;
        ln9.next = ln10;
        

        return ln1;
    }
    
    public void print() {
        ListNode current = this;
        while (current != null) {
            System.out.print(current.val + ", ");
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }
    
    public void empty() {
        
    }
}