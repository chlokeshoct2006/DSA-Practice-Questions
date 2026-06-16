// Last updated: 6/16/2026, 10:08:34 AM
class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);  // Sort the array
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;

        for (int i = 1; i < n - 1; i++) {
            if (nums[i - 1] != nums[i] && nums[i] != nums[i + 1]
                && nums[i - 1] + 1 < nums[i] && nums[i] + 1 < nums[i + 1]) {
                list.add(nums[i]);
            }
        }

        // Single element case
        if (n == 1) {
            list.add(nums[0]);
        }
        else if(n>1){
            // First element check
        if (nums[0] != nums[1] && nums[0] + 1 < nums[1]) {
            list.add(nums[0]);
        }

        // Last element check
        if (nums[n - 1] != nums[n - 2] && nums[n - 2] + 1 < nums[n - 1]) {
            list.add(nums[n - 1]);
        }

        }

        return list;
    }
}