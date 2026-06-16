// Last updated: 6/16/2026, 10:08:54 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for(int i=0; i<=nums.length-1; i++){
            if(nums[i] != 0){
                nums[idx] = nums[i];
                idx++;
            }
        }    
        while(idx < nums.length){
            nums[idx] = 0;
            idx++;
        } 
    }
}