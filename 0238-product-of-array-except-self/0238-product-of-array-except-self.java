class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] pre = new int[len];
        int[] post = new int[len];
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            if (i == 0) {
                pre[i] = nums[i];
            } else {
                pre[i] = nums[i] * pre[i - 1];
            }
        }

        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1) {
                post[i] = nums[i];
            } else {
                post[i] = nums[i] * post[i + 1];
            }
        }

        for (int i = 0; i < len; i++) {
            if (i == 0) {
                result[i] = post[i + 1];
            } else if (i == len - 1) {
                result[i] = pre[i - 1];
            } else {
                result[i] = pre[i - 1] * post[i + 1];
            }

        }

        return result;

    }
}