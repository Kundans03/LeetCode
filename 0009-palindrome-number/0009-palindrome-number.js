/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
    let m = String(x);
    let isTrue = false;
    for (let i = 0, j = m.length - 1; i <= j; i++, j--) {
        if (m.charCodeAt(i) === m.charCodeAt(j)) isTrue=true;
         else return false;
    }
    return isTrue;
};