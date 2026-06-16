// Last updated: 6/16/2026, 10:08:44 AM
class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean increasing = true;
        boolean decreasing = true;

        for (int i=1; i<n; i++){

            if (nums[i] < nums[i-1]){
                increasing = false;
            } else if (nums[i] > nums[i-1]) {
                decreasing = false;
            }

        }
        return increasing || decreasing;
    }
}