class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        // int high = findEnd(numbers, target);
        int high = numbers.length-1;

        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum > target) {
                high--;
            } else if (sum < target) {
                low++;
            } else {
                return new int[] { low+1, high+1 };
            }
        }
        return new int[] { -1, -1 };
    }

    // private static int findEnd(int[] numbers, int target) {
    //     int low = 0;
    //     int high = numbers.length-1;

    //     while (low <= high) {
    //         int mid = low + (high - low) / 2;

    //         if (numbers[mid] > target) {
    //             high = mid - 1;
    //         } else if (numbers[mid] < target) {
    //             low = mid + 1;
    //         }

    //         if (numbers[mid] == target || numbers[mid] > target && numbers[mid - 1] < target) {
    //             return mid;
    //         }
    //     }
    //     return numbers.length-1;
    // }
}