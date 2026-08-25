class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = binarySearch(nums, 0, nums.length - 1, target, true);
        int last = binarySearch(nums, 0, nums.length - 1, target, false);

        return new int[]{first,last};
    }

    public int binarySearch(int[] nums, int low, int high, int target, boolean isLeft) {
        int lastPosition = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else if (target == nums[mid]) {
                if (isLeft) {
                    lastPosition = mid;
                    high = mid - 1;
                } else {
                    lastPosition = mid;
                    low = mid + 1;
                }
            }
        }
        return lastPosition;
    }
}