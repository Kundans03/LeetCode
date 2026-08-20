class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int center = 0;

        for (int row = 0, col1 = 0, col2 = mat.length - 1; row < mat.length; row++, col1++, col2--) {
            if (row == col1 & row == col2) {
                center = mat[row][col1];
            } else {
                sum += mat[row][col1];
                sum += mat[row][col2];
            }
        }

        sum += center;
        return sum;
    }
}