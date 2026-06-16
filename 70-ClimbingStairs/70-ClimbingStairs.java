// Last updated: 6/16/2026, 10:09:27 AM
class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int first = 1;
        int second = 2;
        int total = 0;
        for(int i=3; i<=n; i++){
            total = first + second;
            first = second;
            second = total;
        }
        return second;
    }
}