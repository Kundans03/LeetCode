class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> minInRow = new ArrayList<>();
        List<Integer> maxInCol = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            int min = Integer.MAX_VALUE;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                }
            }
            minInRow.add(min);
        }

        for (int col = 0; col < matrix[0].length; col++) {
            int max = Integer.MIN_VALUE;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] > max) {
                    max = matrix[row][col];
                }
            }
            maxInCol.add(max);
        }

        for (int val : minInRow) {
            if (maxInCol.contains(val)) {
                result.add(val);
            }
        }

        return result;

    }
}