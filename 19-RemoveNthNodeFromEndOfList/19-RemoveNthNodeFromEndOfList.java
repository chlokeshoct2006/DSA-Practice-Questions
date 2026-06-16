// Last updated: 6/16/2026, 10:09:39 AM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //size
        ListNode temp = head;
        int sz = 0;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        //basecase (n==head)
        if(n==sz){
            head = head.next;
            return head;
        }

        //sz-n
        int i = 1;
        int j = sz-n;
        ListNode prev = head;
        while(i < j){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}