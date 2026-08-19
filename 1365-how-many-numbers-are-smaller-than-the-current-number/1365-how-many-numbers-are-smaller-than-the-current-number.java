class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] prefixSum = new int[101];
        int[] result = new int[nums.length];

        for (int num : nums) {
            prefixSum[num]++;
        }

        for (int i = 1; i < 101; i++) {
            prefixSum[i] += prefixSum[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = prefixSum[nums[i] - 1];
            }
        }
        return result;
    }
}