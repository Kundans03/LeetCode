/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function (nums, k) {
    rotationCount =  k%nums.length;

    const rotate = (i, j) => {
        for (; i < j; i++, j--) {
            nums[j] = nums[i] + nums[j];
            nums[i] = nums[j] - nums[i];
            nums[j] = nums[j] - nums[i];
        }
    }
    rotate(nums.length - rotationCount, nums.length - 1);
    rotate(0, nums.length - rotationCount - 1);
    rotate(0, nums.length - 1);

    return nums;
};