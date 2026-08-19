class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freqArr = new int[101];

        for (int i = 0; i < nums.length; i++) {
            freqArr[nums[i]]++;
        }

        int count = 0;

        for (int idx = 0; idx < freqArr.length; idx++) {
            if (freqArr[idx] > 1) {
                count += (freqArr[idx] * (freqArr[idx] - 1)) / 2;
            }
        }
        return count;
    }

}