// Last updated: 6/25/2026, 12:51:46 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> result = new ArrayList<>();
4
5        for (int i = 0; i < numRows; i++) {
6            List<Integer> row = new ArrayList<>();
7
8            for (int j = 0; j <= i; j++) {
9
10                if (j == 0 || j == i) {
11                    row.add(1);
12                } else {
13                    row.add(
14                        result.get(i - 1).get(j - 1) +
15                        result.get(i - 1).get(j)
16                    );
17                }
18            }
19
20            result.add(row);
21        }
22
23        return result;
24    }
25}