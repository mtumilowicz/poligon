package test.lists;

import org.junit.Assert;
import org.junit.Test;
import problems.lists.ListNode;
import problems.lists.ListReverseIterative;

/**
 * Created by mtumilowicz on 2017-10-14.
 */
public class ListReverseIterativeTests {
    
    @Test
    public void nullTest() {
        Assert.assertNull(ListReverseIterative.reverse(null));
    }

    @Test
    public void singleElementListTest() {
        ListNode control = new ListNode(1);
        Assert.assertEquals(control, ListReverseIterative.reverse(control));
    }

    @Test
    public void twoElementListTest() {
        ListNode controlHead = new ListNode(2);
        ListNode control1 = new ListNode(1);
        controlHead.next = control1;
        
        ListNode testHead = new ListNode(1);
        ListNode test1 = new ListNode(2);
        testHead.next = test1;
        
        Assert.assertEquals(controlHead, ListReverseIterative.reverse(testHead));
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
        
        Assert.assertEquals(controlHead, ListReverseIterative.reverse(testHead));
    }

    public void empty() {

    }
}
