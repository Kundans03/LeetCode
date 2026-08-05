/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
    let m = String(x);
    let i = 0, j = m.length - 1;
    let isTrue = false;
    for (let k = 0; k < m.length; k++, i++, j--) {
        if (m.charCodeAt(i) === m.charCodeAt(j)) isTrue=true;
         else return false;
    }
    return isTrue;
};