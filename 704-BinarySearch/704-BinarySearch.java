// Last updated: 6/23/2026, 12:37:57 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0,right = nums.length-1;
4        while(left<=right){
5            int mid = (left+right)/2;
6            if(nums[mid]==target){
7                return mid;
8            }
9            else if(nums[mid]<target){
10                left = mid+1;
11            }
12            else{
13                right = mid-1;
14            }
15        }
16        return -1;
17    }
18}