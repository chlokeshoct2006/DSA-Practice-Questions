// Last updated: 6/16/2026, 10:09:42 AM
class Solution {
    public boolean isPalindrome(int x) {
        int n=x, sum = 0;
        while(n>0){
            int last = n%10;
            sum = sum*10+last;
            n = n/10;
        }
        return (sum==x);
    }
}