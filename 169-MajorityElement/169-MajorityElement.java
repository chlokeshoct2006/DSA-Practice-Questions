// Last updated: 6/16/2026, 10:09:10 AM
class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0,count=0;
        for(int i=0; i<nums.length; i++){
            if(count==0){
                candidate = nums[i];
            }
            if(nums[i]==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}