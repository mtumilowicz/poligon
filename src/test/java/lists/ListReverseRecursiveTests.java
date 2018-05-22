package lists;

import org.junit.Assert;
import org.junit.Test;
import problems.lists.ListNode;
import problems.lists.ListReverseRecursive;

/**
 * Created by mtumilowicz on 2017-10-14.
 */
public class ListReverseRecursiveTests {

    @Test
    public void nullTest() {
        Assert.assertNull(ListReverseRecursive.reverse(null));
    }

    @Test
    public void singleElementListTest() {
        ListNode control = new ListNode(1);
        Assert.assertEquals(control, ListReverseRecursive.reverse(control));
    }

    @Test
    public void twoElementListTest() {
        ListNode controlHead = new ListNode(2);
        controlHead.next = new ListNode(1);

        ListNode testHead = new ListNode(1);
        testHead.next = new ListNode(2);

        Assert.assertEquals(controlHead, ListReverseRecursive.reverse(testHead));
    }

    @Test
    public void threeElementListTest() {
        ListNode controlHead = new ListNode(3);
        ListNode control1 = new ListNode(2);
        ListNode control2 = new ListNode(1);
        controlHead.next = control1;
        control1.next = control2;

        ListNode testHead = new ListNode(1);
        ListNode test1 = new ListNode(2);
        ListNode test2 = new ListNode(3);
        testHead.next = test1;
        test1.next = test2;

        Assert.assertEquals(controlHead, ListReverseRecursive.reverse(testHead));
    }
}
