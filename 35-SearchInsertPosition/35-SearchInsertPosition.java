// Last updated: 6/23/2026, 1:26:13 PM
1class Solution {
2    public int trap(int[] height) {
3        int n = height.length;
4        int leftMax[] = new int[n];
5        leftMax[0] = height[0];
6        for(int i=1; i<n; i++){
7            leftMax[i] = Math.max(height[i], leftMax[i-1]);
8        }
9        int rightMax[] = new int[n];
10        rightMax[n-1] = height[n-1];
11        for(int i=n-2; i>=0; i--){
12            rightMax[i] = Math.max(height[i], rightMax[i+1]);
13        }
14        int trappedWater = 0;
15        for(int i=0; i<n; i++){
16            int waterLevel = Math.min(leftMax[i], rightMax[i]);
17            trappedWater += waterLevel - height[i];
18        }
19        return trappedWater;
20    }
21}