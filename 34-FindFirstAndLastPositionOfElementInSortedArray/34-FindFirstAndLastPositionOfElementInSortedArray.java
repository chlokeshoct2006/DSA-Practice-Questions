// Last updated: 6/16/2026, 10:09:32 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findIndex(nums,target,true);
        int last=findIndex(nums,target,false);
        return new int[]{first,last};
    }
    private static int findIndex(int[] nums, int target, boolean first){
        int start=0, end=nums.length-1, ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                ans = mid;
                if(first){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}