class Solution {
    public int[][] generateMatrix(int n) {
        int[][] spiral = new int[n][n];

        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;

        int num = 1;

        while (top <= bottom && left <= right) {
            for (int col = left; col <= right; col++) {
                spiral[top][col] = num++;
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                spiral[row][right] = num++;
            }
            right--;

            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    spiral[bottom][col] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    spiral[row][left] = num++;
                }
                left++;
            }
        }

        return spiral;

    }
}