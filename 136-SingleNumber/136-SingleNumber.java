// Last updated: 6/16/2026, 10:09:18 AM
class Solution {
    public int singleNumber(int[] nums) {
        int uniqueNo = 0;
        for(int i=0; i<nums.length; i++){
            uniqueNo ^= nums[i];
        }
        return uniqueNo;
    }
}