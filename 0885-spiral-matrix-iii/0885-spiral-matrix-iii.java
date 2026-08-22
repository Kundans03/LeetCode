class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        int[][] result = new int[rows * cols][2]; // here in result 2D array we will storage positions [rows * col] denotes the size of the array and [2] denotes the position of the cell

        int idx = 0; //for tracking no of results

        //as number of steps increases after each 2 concurrent turn 
        int steps = 1; // initial steps 1 because initially after 1 step there is a turn

        int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } }; //this is how we move east,south,west,north in reapet

        int dirIndex = 0; // its dirIndex to store current ongoing step

        //for traking current location (it could be inside or outside of the matrix)
        int currentR = rStart;
        int currentC = cStart;

        // while loop this is the parent loop runs until all the positions are filled in the result array
        while (idx < rows * cols) {

            //as there are two turns before increase step cormaking spiral structure
            for (int i = 0; i < 2; i++) {
                int[] dir = dirs[dirIndex]; //because we more east,south,west,north concurrently so it stores in which we are moving

                for (int s = 0; s < steps; s++) { //this loop tracks the total number of steps

                    //check for putting location in result array
                    if (currentR >= 0 && currentR < rows && currentC >= 0 && currentC < cols) {
                        result[idx][0] = currentR;
                        result[idx][1] = currentC;
                        idx++;
                    }

                    // increase in current row and current col
                    currentR += dir[0];
                    currentC += dir[1];
                }

                dirIndex = (dirIndex + 1) % 4; //this will rotate the dirIndex with in the total number of dirs

            }

            steps++; //increase in step

        }

        // System.out.print(Arrays.deepToString(result)); 
        return result; //returning the final 2D answer ayyar
    }
}