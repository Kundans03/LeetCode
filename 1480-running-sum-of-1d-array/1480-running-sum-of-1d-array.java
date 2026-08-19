class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sumUpto=0;
        for(int i=0; i<nums.length; i++){
            runningSum[i] = nums[i] + sumUpto;
            sumUpto += nums[i];
        }
        return runningSum;
    }
}