// Last updated: 7/6/2026, 1:20:41 PM
1class Solution {
2    public int[] sortArray(int[] nums) {
3        int max = nums[0];
4        int min = nums[0];
5
6        for(int i=1; i<nums.length; i++){
7            if(nums[i]>max) max = nums[i];
8        }
9        for(int i=1; i<nums.length; i++){
10            if(nums[i]<min) min = nums[i];
11        }
12        int[] freq = new int[max-min+1];
13        for(int i=0; i<nums.length; i++){
14            freq[nums[i] - min]++;
15        }
16        int index = 0;
17
18        for (int i = 0; i < freq.length; i++){
19            while (freq[i] > 0) {
20                nums[index++] = i + min;
21                freq[i]--;
22            }
23        }
24        return nums;
25    }
26}