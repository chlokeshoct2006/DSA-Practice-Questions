// Last updated: 6/23/2026, 1:22:54 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int l = 0, r = nums.length - 1;
4        while (l < r) {
5            int mid = (l + r) / 2;
6            if (nums[mid] > nums[mid + 1]) {
7                r = mid;
8            } else {
9                l = mid + 1;
10            }
11        }
12        return l;
13    }
14}