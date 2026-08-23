/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int guessNum = left + (right - left) / 2;
            int responce = guess(guessNum);

            if (responce == -1) {
                right = guessNum - 1;
            } else if (responce == 1) {
                left = guessNum + 1;
            } else {
                return guessNum;
            }
        }
        return -1;
    }
}