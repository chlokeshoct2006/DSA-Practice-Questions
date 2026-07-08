// Last updated: 7/8/2026, 10:04:06 PM
1class Solution {
2    public String[] sortPeople(String[] names, int[] heights) {
3        Map<Integer, String> map = new HashMap<>();
4        for (int i = 0; i < names.length; i++) {
5            map.put(heights[i], names[i]);
6        }        
7        Arrays.sort(heights);
8        String[] result = new String[heights.length];
9        int index = 0;
10        for (int i = heights.length - 1; i >= 0; i--) {
11            result[index] = map.get(heights[i]);
12            index++;
13        }
14        return result;
15    }
16}