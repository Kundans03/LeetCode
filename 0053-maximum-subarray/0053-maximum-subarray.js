/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function (nums) {
    let sum = 0;
    let max = -Infinity;
    let i = 0;
    while (i < nums.length) {
        sum += nums[i];
        max=Math.max(sum,max);
        if (sum < 0) sum = 0;
        i++;
    }
    return max;
};