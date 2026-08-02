/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function (nums) {
    let r = 0;
    let b = nums.length - 1;
    let i = 0;

    while (i <= b) {
        if (nums[i] === 0) {
            let temp = nums[r];
            nums[r++] = nums[i];
            nums[i++] = temp;
        } else if (nums[i] === 2) {
            let temp = nums[b];
            nums[b--] = nums[i];
            nums[i] = temp
        } else {
            i++;
        }
    }

    return nums;

};