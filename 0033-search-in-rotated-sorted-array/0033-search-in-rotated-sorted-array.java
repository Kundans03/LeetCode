class Solution {
    public int search(int[] nums, int target) {
        int k = findRotationCount(nums);

        if (k != -1) {
            int left = binarySearch(nums, 0, k, target);
            int right = binarySearch(nums, k, nums.length - 1, target);

            if (left == -1) {
                return right;
            } else {
                return left;
            }
        }

        return binarySearch(nums, 0, nums.length - 1, target);

    }

    public int findRotationCount(int nums[]) {
        int low = 0;
        int high = nums.length - 1;

        if (nums[low] <= nums[high]) {
            return -1;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public int binarySearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}