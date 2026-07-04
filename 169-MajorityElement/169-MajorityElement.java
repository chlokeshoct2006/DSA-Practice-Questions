// Last updated: 7/4/2026, 9:32:30 AM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int candidate=0,count=0;
4        for(int i=0; i<nums.length; i++){
5            if(count==0){
6                candidate = nums[i];
7            }
8            if(nums[i]==candidate){
9                count++;
10            }
11            else{
12                count--;
13            }
14        }
15        return candidate;
16    }
17}