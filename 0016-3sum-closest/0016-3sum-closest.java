class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {

            for (int first = i + 1, last = nums.length - 1; first < last;) {
                int sum = nums[i] + nums[first] + nums[last];

                if (sum > target) {
                    last--;
                } else if (sum < target) {
                    first++;
                } else if (sum == target) {
                    return sum;
                } else {
                    first++;
                    last--;
                }

                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }

        }
        return result;
    }
}