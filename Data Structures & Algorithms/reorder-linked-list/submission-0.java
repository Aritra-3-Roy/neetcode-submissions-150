/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode makeReverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode findMiddle(ListNode slow, ListNode fast)
    {
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void reorderList(ListNode head) {
        ListNode middleNode = findMiddle(head, head);
        ListNode reverseHead = makeReverse(middleNode.next);
        middleNode.next = null;

        ListNode firstHead = head;

        while(reverseHead != null)
        {
            ListNode temp1 = firstHead.next;
            ListNode temp2 = reverseHead.next;

            firstHead.next = reverseHead;
            reverseHead.next = temp1;

            firstHead = temp1;
            reverseHead = temp2;
        }
    }
}
