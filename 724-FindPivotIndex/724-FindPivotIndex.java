// Last updated: 7/13/2026, 1:05:48 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int n = nums.length;
4        int[] leftSum = new int[n];
5        int[] rightSum = new int[n];
6        leftSum[0] = nums[0];
7        for(int i=1; i<n; i++){
8            leftSum[i] = leftSum[i-1]+nums[i];
9        }
10        rightSum[n-1] = nums[n-1];
11        for(int i=n-2; i>=0; i--){
12            rightSum[i] = rightSum[i+1]+nums[i];
13        }
14
15        for(int i=0; i<n; i++){
16            if(leftSum[i]==rightSum[i]){
17                return i;
18            }
19        }
20        return -1;
21    }
22}