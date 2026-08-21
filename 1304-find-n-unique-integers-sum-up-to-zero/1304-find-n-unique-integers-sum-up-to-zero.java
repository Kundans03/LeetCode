class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];

        for (int i = 1, j = 0; i <= n / 2; i++) {
            arr[j++] = i;
            arr[j++] = i * -1;
        }

        if (n % 2 != 0) {
            arr[n - 1] = 0;
        }

        return arr;
    }
}