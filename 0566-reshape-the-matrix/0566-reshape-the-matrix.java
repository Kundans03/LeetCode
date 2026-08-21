class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] newMatrix = new int[r][c];

        if (mat.length * mat[0].length != r * c) {
            return mat;
        }

        int nRow = 0, nCol = 0;

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                newMatrix[nRow][nCol] = mat[row][col];
                nCol++;
                if (nCol == c) {
                    nCol = 0;
                    nRow++;
                }
            }
        }

        return newMatrix;

    }
}