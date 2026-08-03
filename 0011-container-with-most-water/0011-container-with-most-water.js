/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function (height) {
    let maxArea = 0;
    let i = 0;
    let j = height.length - 1;
    
    while (i < j) {
        if ((Math.min(height[i], height[j]) * (j - i)) > maxArea) {
            maxArea = Math.min(height[i], height[j]) * (j - i);
        }
        if (height[j] >= height[i]) {
            i++;
        } else if (height[i] > height[j]) {
            j--;
        }

    }
    return maxArea;
};