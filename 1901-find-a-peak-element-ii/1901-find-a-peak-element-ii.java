class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = cols-1;

        while(low<=high){ // for column
            int midCol = low + (high-low) / 2;

            int maxRow = 0;
            for(int r=0; r<rows; r++){
                if(mat[r][midCol]>mat[maxRow][midCol]){
                    maxRow = r;
                }
            }

            int left = midCol>0 ? mat[maxRow][midCol-1] : -1;
            int right = midCol<cols-1 ? mat[maxRow][midCol+1] : -1;

            if(mat[maxRow][midCol] > left && mat[maxRow][midCol] > right){
                return new int[]{maxRow,midCol};
            }

            if(mat[maxRow][midCol] > left){
                low = midCol + 1;
            }else{
                high = midCol - 1;
            }
        }
            return new int[]{-1,-1};
    }
}