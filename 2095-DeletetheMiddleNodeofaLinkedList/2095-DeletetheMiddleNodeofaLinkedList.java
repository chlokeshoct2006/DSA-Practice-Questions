// Last updated: 7/13/2026, 1:21:23 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteMiddle(ListNode head) {
13        if (head == null || head.next == null)
14            return null;
15
16        ListNode slow = head;
17        ListNode fast = head.next.next;
18
19        while (fast != null && fast.next != null) {
20            slow = slow.next;
21            fast = fast.next.next;
22        }
23
24        slow.next = slow.next.next;
25
26        return head;
27    }
28}