class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;

        if (nums.length == 0) {
            return new int[] { first, last };
        }

        first = binarySearch(0, nums.length - 1, nums, target, false);
        last = binarySearch(0, nums.length - 1, nums, target, true);

        return new int[] { first, last };

    }

    static int binarySearch(int start, int end, int[] nums, int target, boolean isForward) {
        int position = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                position = mid;
                if (isForward) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return position;
    }
}