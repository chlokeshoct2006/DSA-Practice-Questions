// Last updated: 7/1/2026, 1:12:21 PM
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        if(n==0) return true;
4        for(int i=0; i<flowerbed.length; i++){
5            int left = (i==0)?0:flowerbed[i-1];
6            int right = (i==flowerbed.length-1)?0:flowerbed[i+1];
7            if(flowerbed[i]==0 && left==0 && right==0){
8                flowerbed[i]=1;
9                n--;
10                if(n==0) return true;
11            }
12            
13        }
14        return false;
15    }
16}