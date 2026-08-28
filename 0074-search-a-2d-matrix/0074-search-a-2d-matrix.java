class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarySearch(matrix, rows - 1, 0, cols - 1, target);
        }

        if (matrix == null || rows == 0 || cols == 0) {
            return false;
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) {
            int rMid = rStart + (rEnd - rStart) / 2;

            if (target == matrix[rMid][cMid]) {
                return true;
            }

            if (target > matrix[rMid][cMid]) {
                rStart = rMid;
            } else {
                rEnd = rMid;
            }
        }

        //checking in rest two rows

        if (target == matrix[rStart][cMid]) {
            return true;
        }

        if (target == matrix[rStart + 1][cMid]) {
            return true;
        }

        //cheking all rest 4 reagions

        if (cMid > 0 && target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }

        if (cMid < cols-1 && target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        if (cMid > 0 && target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }

        if (cMid < cols-1 && target >= matrix[rStart + 1][cMid + 1]) {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

        return false;

    }

    boolean binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (target == matrix[row][mid]) {
                return true;
            }

            if (target > matrix[row][mid]) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return false;
    }

}