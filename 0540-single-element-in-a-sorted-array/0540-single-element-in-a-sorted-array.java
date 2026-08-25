class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid % 2 == 0 && mid > 0 && mid < nums.length - 1) {
                if (nums[mid - 1] == nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (mid % 2 != 0 && mid > 0 && mid < nums.length - 1) {
                if (nums[mid - 1] == nums[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                return nums[mid];
            }
        }

        if (low == high) {
            return nums[low];
        }

        return nums[low - 1];
    }
}