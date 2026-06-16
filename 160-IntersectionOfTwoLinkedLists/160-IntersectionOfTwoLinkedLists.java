// Last updated: 6/16/2026, 10:09:12 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        // Step 1: Find the lengths of both lists
        ListNode currA = headA;
        ListNode currB = headB;
        int lengthA = 0, lengthB = 0;

        while (currA != null) {
            lengthA++;
            currA = currA.next;
        }

        while (currB != null) {
            lengthB++;
            currB = currB.next;
        }

        // Step 2: Align the pointers
        currA = headA;
        currB = headB;

        // If A is longer, move its pointer forward by the difference in lengths
        while (lengthA > lengthB) {
            currA = currA.next;
            lengthA--;
        }

        // If B is longer, move its pointer forward by the difference in lengths
        while (lengthB > lengthA) {
            currB = currB.next;
            lengthB--;
        }

        // Step 3: Move both pointers one step at a time until they meet
        while (currA != null && currB != null) {
            if (currA == currB) {
                return currA; // Found the intersection
            }
            currA = currA.next;
            currB = currB.next;
        }

        // If no intersection, return null
        return null;
    }
}