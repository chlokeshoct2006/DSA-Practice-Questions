// Last updated: 6/16/2026, 10:08:29 AM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int total = 0;
        for(int i = 0; i < tickets.length; i++){
            if(i <= k){
                total += Math.min(tickets[i], tickets[k]);
            }
            else{
                total += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return total;
    }
}