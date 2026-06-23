// Last updated: 6/23/2026, 1:24:56 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        if(nums.length==1){
4            return nums[0];
5        }
6        for(int i=0; i<nums.length-1; i+=2){
7            if(nums[i]!=nums[i+1]){
8                return nums[i];   
9            }
10        }
11        return nums[nums.length-1];
12    }
13}