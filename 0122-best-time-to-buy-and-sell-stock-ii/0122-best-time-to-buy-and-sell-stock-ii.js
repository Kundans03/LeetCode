/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
    let Profit = 0;
    let minimumPrice = prices[0];

    let i = 0;
    while (i < prices.length) {
        if (prices[i] < minimumPrice) {
            minimumPrice = prices[i];
        } else if ((prices[i] - minimumPrice) > 0) {
            Profit = Profit + (prices[i] - minimumPrice);
            minimumPrice = prices[i];
        }
        i++;

    }
    return Profit;
};