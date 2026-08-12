class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> finalset = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int left = i + 1, right = nums.length - 1; left < right;) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0)
                    left++;
                else if (sum > 0)
                    right--;
                else {
                    finalset.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
            }

        }

    return new ArrayList<>(finalset);

    }
}