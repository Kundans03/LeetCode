class Solution {
    public static int sumArray(int nums[], int sum, int idx) {
        if (idx == nums.length)
            return sum;

        sum += nums[idx] + sumArray(nums, sum, idx + 1);
        ;
        return sum;

    }

    public static int requiredSum(int length, int idx, int sum) {
        if (idx == length)
            return sum += sum + idx;
        sum += idx + requiredSum(length, idx + 1, sum);
        return sum;
    }

    public int missingNumber(int[] nums) {
      int arraySum = sumArray(nums,0,0);
      int requiredSum = requiredSum(nums.length,0,0);
      return requiredSum-arraySum;
    }
}