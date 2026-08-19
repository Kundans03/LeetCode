class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];

        int j = 0;
        for (int i = 0; i < n; j += 2, i++) {
            arr[j] = nums[i];
            arr[j + 1] = nums[i + n];
        }

        return arr;
    }
}