class Solution {
    public int largestAltitude(int[] gain) {
        int highestAltitude = 0;

        int currentPosition = 0;
        for (int step : gain) {
            currentPosition += step;
            if (currentPosition > highestAltitude)
                highestAltitude = currentPosition;
        }

        return highestAltitude;
    }
}