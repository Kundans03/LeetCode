class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];

        for (int idx = 1; idx < piles.length; idx++) {
            if (piles[idx] > high) {
                high = piles[idx];
            }
        }

        int speed = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int total_hours = 0;
            for (int banana : piles) {
                total_hours += (banana + mid - 1) / mid;
                if (total_hours > h) {
                    break;
                }
            }

            if (total_hours <= h) {
                speed = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return speed;

    }
}