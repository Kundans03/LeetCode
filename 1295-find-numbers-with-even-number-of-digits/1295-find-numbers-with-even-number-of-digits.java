class Solution {
    public int findNumbers(int[] nums) {
        int numWithEvenDigits = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            String number = String.valueOf(nums[idx]);
            if (number.length() % 2 == 0) {
                numWithEvenDigits++;
            }
        }
        return numWithEvenDigits;
    }
}