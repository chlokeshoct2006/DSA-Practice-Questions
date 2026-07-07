// Last updated: 7/7/2026, 1:53:25 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int i = m-1;
4        int j = n-1;
5        int k = m+n-1;
6        while(i>=0 && j>=0){
7            if(nums1[i]>nums2[j]){
8                nums1[k]=nums1[i];
9                i--;
10            }
11            else{
12                nums1[k] = nums2[j];
13                j--;
14            }
15            k--;
16        }
17        while(i>=0){
18            nums1[k--] = nums1[i--];
19        }
20        while(j>=0){
21            nums1[k--] = nums2[j--];
22        }
23    }
24}