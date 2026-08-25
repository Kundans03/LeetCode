class Solution {
    public int findKthPositive(int[] arr, int k) {
        int reqNum = -1;

        int idx = 1;
        int arrIdx = 0;

        int numShould = 1;
        int missCount = 0;

        while (reqNum == -1) {
            if (arrIdx < arr.length && arr[arrIdx] == numShould) {
                arrIdx++;
            } else {
                missCount++;
            }

            if (missCount == k) {
                reqNum = numShould;
            }

            idx++;
            numShould++;
        }

        // System.out.print(reqNum);
        return reqNum;
    }
}