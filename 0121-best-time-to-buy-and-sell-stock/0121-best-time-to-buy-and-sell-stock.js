/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {

    let maxProfit = 0;

    let minimumPrice = prices[0];

    let i = 0;
    while (i < prices.length) {
        if (prices[i] < minimumPrice) {
            minimumPrice = prices[i];
        } else if ((prices[i] - minimumPrice) > maxProfit) {
            maxProfit = prices[i] - minimumPrice;
        }
        i++;

    }

    return maxProfit;
};