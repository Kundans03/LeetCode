class Solution {
    public int splitArray(int[] nums, int k) {
        long max = 0;
        long total = 0;

        for (int num : nums) {
            total += num;
            max = Math.max(max, num);
        }

        long left = max;
        long right = total;

        while (left <= right) {
            long mid = (left + right) / 2;

            if (isSubArrPossible(nums, mid, k)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return (int) left;
    }

    boolean isSubArrPossible(int[] nums, long max, int k) {
        long sum = 0;
        int count = 1;

        for (int num : nums) {
            sum += num;
            if (sum > max) {
                sum = num;
                count++;
            }
            if (count > k) {
                return false;
            }
        }
        return true;
    }
}