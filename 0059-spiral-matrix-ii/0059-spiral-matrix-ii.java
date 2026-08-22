class Solution {
    public int[][] generateMatrix(int n) {
        int[][] spiral = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int inputValue = 1;

        while (top <= bottom && left <= right) {
            inputValue = row(left, right + 1, top, false, spiral, inputValue);
            top++;

            inputValue = col(top, bottom + 1, right, false, spiral, inputValue);
            right--;

            if (top <= bottom) {
                inputValue = row(left, right + 1, bottom, true, spiral, inputValue);
                bottom--;
            }

            if (left <= right) {
                inputValue = col(top, bottom + 1, left, true, spiral, inputValue);
                left++;
            }
        }

        return spiral;
    }

    static int row(int start, int end, int row, boolean isReverse, int[][] spiral, int inputValue) {
        if (isReverse) {
            for (int i = end - 1; i >= start; i--) {
                spiral[row][i] = inputValue++;
            }
        } else {
            for (int i = start; i < end; i++) {
                spiral[row][i] = inputValue++;
            }
        }
        return inputValue;
    }

    static int col(int start, int end, int col, boolean isReverse, int[][] spiral, int inputValue) {
        if (isReverse) {
            for (int i = end - 1; i >= start; i--) {
                spiral[i][col] = inputValue++;
            }
        } else {
            for (int i = start; i < end; i++) {
                spiral[i][col] = inputValue++;
            }
        }
        return inputValue;
    }
}