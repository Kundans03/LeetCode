class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        
        int low = 1;
        int high = num;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;
            if (square > num) {
                high = mid - 1;
            } else if (square < num) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}