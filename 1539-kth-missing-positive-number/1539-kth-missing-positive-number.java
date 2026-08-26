class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num = 1;

        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] - mid - 1 < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low + k;
    }
}