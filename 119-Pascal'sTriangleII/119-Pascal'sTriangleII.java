// Last updated: 6/29/2026, 1:30:39 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int buyPrice = Integer.MAX_VALUE;
4        int maxProfit = 0;
5        for(int i=0; i<prices.length;i++){
6            if(buyPrice<prices[i]){
7                int profit = prices[i] - buyPrice;
8                maxProfit = Math.max(maxProfit,profit);
9            }
10            else{
11                buyPrice = prices[i];
12            }
13        }
14        return maxProfit;
15    }
16}