class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        for(int idx=0; idx<indices.length; idx++){
            for(int row=0; row<m; row++) {
                matrix[row][indices[idx][1]]++;
            }

            for(int col=0; col<n; col++) {
                matrix[indices[idx][0]][col]++;
            }
        }

        int oddValueCount=0;
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                if(matrix[row][col] % 2 != 0){
                    oddValueCount++;
                }
            }
        }
            return oddValueCount;
    }
}