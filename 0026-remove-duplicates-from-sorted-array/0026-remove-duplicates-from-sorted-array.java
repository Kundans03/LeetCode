class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;

        while (left<nums.length) {
            if (nums[right-1] != nums[left]) {
                nums[right++]=nums[left++];
            } else {
                left++;
            }
        }
        return right;
    }
}