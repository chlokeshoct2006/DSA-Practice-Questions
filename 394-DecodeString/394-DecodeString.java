// Last updated: 6/16/2026, 12:56:14 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> numStack = new Stack<>();
4        Stack<String> strStack = new Stack<>();
5
6        String currString = "";
7        int currNum = 0;
8        for(int i = 0; i < s.length(); i++) {
9
10            char ch = s.charAt(i);
11
12            if(ch >= '0' && ch <= '9') {
13                // digit
14                currNum = currNum * 10 + (ch - '0');
15            }
16            else if(ch == '[') {
17                // opening bracket
18                numStack.push(currNum);
19                strStack.push(currString);
20
21                currNum = 0;
22                currString = "";
23            }
24            else if(ch == ']') {
25                // closing bracket
26                int repeat = numStack.pop();
27                String prev = strStack.pop();
28
29                StringBuilder temp = new StringBuilder(prev);
30
31                for (int j = 0; j < repeat; j++) {
32                    temp.append(currString);
33                }
34
35                currString = temp.toString();
36            }
37            else {
38                // letter
39                currString += ch;
40            }
41        }
42        return currString;
43    }
44}