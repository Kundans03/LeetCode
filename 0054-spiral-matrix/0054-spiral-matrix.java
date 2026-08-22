class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            row(left, right + 1, top, false, spiral, matrix);
            top++;

            col(top, bottom + 1, right, false, spiral, matrix);
            right--;

            if (top <= bottom) {
                row(left, right + 1, bottom, true, spiral, matrix);
                bottom--;
            }

            if (left <= right) {
                col(top, bottom + 1, left, true, spiral, matrix);
                left++;
            }
        }

        // System.out.println(spiral);
        return spiral;

    }

    static void row(int start, int end, int row, boolean isReverse, List<Integer> spiral, int[][] matrix) {
        if (isReverse) {
            for (int i = end - 1; i >= start; i--) {
                spiral.add(matrix[row][i]);
            }
        } else {
            for (int i = start; i < end; i++) {
                spiral.add(matrix[row][i]);
            }
        }
    }

    static void col(int start, int end, int col, boolean isReverse, List<Integer> spiral, int[][] matrix) {
        if (isReverse) {
            for (int i = end - 1; i >= start; i--) {
                spiral.add(matrix[i][col]);
            }
        } else {
            for (int i = start; i < end; i++) {
                spiral.add(matrix[i][col]);
            }
        }
    }
}