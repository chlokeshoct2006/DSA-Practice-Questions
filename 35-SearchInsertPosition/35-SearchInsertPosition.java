// Last updated: 6/23/2026, 1:00:07 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int left = 0, right = nums.length-1;
4        while(left<=right){
5            int mid = (left+right)/2;
6            if(nums[mid]==target) return mid;
7            else if(nums[mid]<target){
8                left = mid+1;
9            }
10            else{
11                right = mid-1;
12            }
13        }
14        return left;
15    }
16}