class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int left = j + 1, right = nums.length - 1; left < right;) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target)
                        right--;
                    else if (sum < target)
                        left++;
                    else if (sum == target
                            && !result.contains(Arrays.asList(nums[i], nums[j], nums[left], nums[right]))) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    } else {
                        left++;
                        right--;
                    }
                }
            }
        }
        return result;
    }
}