// Last updated: 6/16/2026, 10:09:24 AM
class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0 , high = n-1;

        while(low <= high){
            int mid = (low + high )/2;

            if(nums[mid] == target) return true;

            // edge case: duplicates
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
                continue;
            }

            // left sorted part
            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target <= nums[mid]){
                    high = mid -1;
                }else{
                    low = mid + 1;
                }
            }
            // right sorted part
            else {
                if(target > nums[mid] && target <= nums[high]){
                    low = mid +1 ;
                }else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}