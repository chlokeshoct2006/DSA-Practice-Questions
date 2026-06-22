// Last updated: 6/22/2026, 1:12:55 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        k = k % nums.length;
4        reverse(nums,0,nums.length-1);
5        reverse(nums,0,k-1);
6        reverse(nums,k,nums.length-1);
7    }
8    private static void reverse(int[] nums, int start, int end){
9        while(start<end){
10            int temp = nums[start];
11            nums[start] = nums[end];
12            nums[end] = temp;
13            start++;
14            end--;
15        }
16    }
17}