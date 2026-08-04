/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function (nums) {
    let maxElement = nums[0];
    if (nums.length === 1) return nums[0];
    for (let count = 1, i = 1; i < nums.length; i++) {
        if (nums[i] !== maxElement) {
            if (count === 0) {
                maxElement = nums[i];
                count++;
            } else {
                count--;
            }
        } else count++;
    }
    return maxElement;
};