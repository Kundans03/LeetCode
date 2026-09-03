class Solution {
    public int findMin(int[] nums) {
        int maxIdx = findRotationTime(nums);
        if (maxIdx == nums.length - 1) {
            return nums[0];
        }

        return nums[maxIdx + 1];
    }

    int findRotationTime(int[] nums) {
        // int low = 0;
        // int high = nums.length-1;
        int maxIdx = 0;

        // while(low<=high) {
        //     int mid = low + (high-low) / 2;

        //     if(){

        //     }
        // }

        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] < nums[maxIdx]) {
                return maxIdx;
            }
            if (nums[idx] >= nums[maxIdx]) {
                maxIdx = idx;
            }
        }

        return maxIdx;
    }
}