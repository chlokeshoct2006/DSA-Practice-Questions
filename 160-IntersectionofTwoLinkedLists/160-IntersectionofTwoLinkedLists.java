// Last updated: 7/13/2026, 12:50:24 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        if (headA == null || headB == null) {
15            return null;
16        }
17
18        // Step 1: Find the lengths of both lists
19        ListNode currA = headA;
20        ListNode currB = headB;
21        int lengthA = 0, lengthB = 0;
22
23        while (currA != null) {
24            lengthA++;
25            currA = currA.next;
26        }
27
28        while (currB != null) {
29            lengthB++;
30            currB = currB.next;
31        }
32
33        // Step 2: Align the pointers
34        currA = headA;
35        currB = headB;
36
37        // If A is longer, move its pointer forward by the difference in lengths
38        while (lengthA > lengthB) {
39            currA = currA.next;
40            lengthA--;
41        }
42
43        // If B is longer, move its pointer forward by the difference in lengths
44        while (lengthB > lengthA) {
45            currB = currB.next;
46            lengthB--;
47        }
48
49        // Step 3: Move both pointers one step at a time until they meet
50        while (currA != null && currB != null) {
51            if (currA == currB) {
52                return currA; // Found the intersection
53            }
54            currA = currA.next;
55            currB = currB.next;
56        }
57
58        // If no intersection, return null
59        return null;
60    }
61}