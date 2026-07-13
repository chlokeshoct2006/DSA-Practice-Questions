// Last updated: 7/13/2026, 12:41:06 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int[] v = new int[n+1];
5        Arrays.fill(v,-1);
6        for(int i=0; i<nums.length; i++){
7            v[nums[i]] = nums[i];
8        }
9        for(int j=0; j<v.length; j++){
10            if(v[j]==-1) return j;
11        }
12        return 0;
13    }
14}