// Last updated: 7/13/2026, 1:18:45 PM
1class Solution {
2    public int thirdMax(int[] nums) {
3        List<Integer> list = new ArrayList<>();
4        
5        for(int i=0; i<nums.length; i++) {
6            if(!list.contains(nums[i])) {
7                list.add(nums[i]);
8            }
9        }
10
11        Collections.sort(list);
12        
13        if(list.size() < 3) {
14            return list.get(list.size()-1);
15        } else {
16            return list.get(list.size()-3);
17        }
18    }
19}