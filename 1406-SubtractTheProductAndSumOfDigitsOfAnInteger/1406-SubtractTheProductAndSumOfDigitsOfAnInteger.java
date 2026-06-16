// Last updated: 6/16/2026, 10:08:38 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1,sum = 0;
        while(n!=0){
            int digit = n%10;
            prod *= digit;
            sum += digit;
            n /= 10;
        }
        return (prod-sum);
    }
}