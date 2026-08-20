class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                newMatrix[col][row] = matrix[row][col];
            }
        }
        return newMatrix;
    }
}