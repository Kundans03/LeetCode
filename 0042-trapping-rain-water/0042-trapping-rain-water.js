/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function (height) {
    let leftHeight = [];
    let leftHeightest = height[0];
    let rightHeight = [];
    let rightHeightest = height[height.length - 1];
    let sum = 0;

    for (let i = 0; i < height.length; i++) {
        if (height[i] > leftHeightest) {
            leftHeight[i] = height[i];
            leftHeightest = height[i];
        } else {
            leftHeight[i] = leftHeightest;
        }
    }

    for (let j = height.length - 1; j >= 0; j--) {
        if (height[j] > rightHeightest) {
            rightHeight[j] = height[j];
            rightHeightest = height[j];
        } else {
            rightHeight[j] = rightHeightest;
        }
    }

    for (let k = 0; k < height.length; k++) {
        sum += Math.min(leftHeight[k], rightHeight[k]) - height[k];
    }
    return sum;

};