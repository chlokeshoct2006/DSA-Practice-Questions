// Last updated: 6/16/2026, 10:09:29 AM
class Solution {
    public double myPow(double x, int n) {
        long N = n;
        double result = 1;
        if(n<0){
            x=1/x;
            N=-N;
        }
        return power(x,N);
    }
    public double power(double x,long N){
        double result = 1;
        if(N==0) return 1;
        double half = power(x,N/2);
        if(N%2==0) return half*half;
        return x*half*half;
    }
}