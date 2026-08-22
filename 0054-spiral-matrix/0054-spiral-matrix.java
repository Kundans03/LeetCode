class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();

        int r = matrix.length;
        int c = matrix[0].length;

        int left = 0, right = c - 1;
        int top = 0, bottom = r - 1;

        while (top <= bottom && left <= right) {

            for (int col = left; col <= right; col++) {
                spiral.add(matrix[top][col]);
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                spiral.add(matrix[row][right]);
            }
            right--;

            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    spiral.add(matrix[bottom][col]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    spiral.add(matrix[row][left]);
                }
                left++;
            }

        }

        return spiral;

    }
}