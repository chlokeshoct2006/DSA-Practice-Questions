// Last updated: 7/9/2026, 10:44:15 AM
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        int leftsum=0;
4        int rightsum=0;
5        int maxsum=0;
6        for(int i=0;i<k;i++){
7            leftsum+=cardPoints[i];
8        }
9        maxsum=leftsum;
10        int index=cardPoints.length-1;
11        for(int i=k-1;i>=0;i--){
12            rightsum+=cardPoints[index];
13            index--;
14            leftsum-=cardPoints[i];
15            maxsum=Math.max(maxsum , leftsum+rightsum);
16        }
17        return maxsum;
18    }
19}