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
    private ListNode findLastNode(ListNode head, int diff){
        int counter = 1;
        ListNode last = head;
        while(counter != diff){
            counter++;
            last = last.next;
        }
        return last;
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail = head;
        int len = 1;

        if(head == null || head.next == null){
            return head;
        }

        while (tail.next != null) {
            len++;
            tail = tail.next;
        }

        if (k % len == 0) {
            return head;
        }

        k = k % len;

        tail.next = head;
        ListNode newLastNode = findLastNode(head, len - k);
        head = newLastNode.next;
        newLastNode.next = null;

        return head;

    }
}