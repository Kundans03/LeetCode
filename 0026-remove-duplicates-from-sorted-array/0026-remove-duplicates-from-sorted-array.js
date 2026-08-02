/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
    let j = 1;
    for (let i = 0; i < nums.length; i++) {
        if (nums[j - 1] != nums[i]) {
            nums[j] = nums[i];
            j++;
        }
    }
    return j;
};