class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int m = binarySearch(letters, target);
        return letters[m];
    }

    public static int binarySearch(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target >= letters[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (low == letters.length) {
            return 0;
        } else if (letters[low] == target) {
            return low + 1;
        }

        return low;

    }
}