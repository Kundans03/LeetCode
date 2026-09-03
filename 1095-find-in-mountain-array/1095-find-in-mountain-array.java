/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();

        int left = 0;
        int right = length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int peakElement = left;

        if(mountainArr.get(peakElement) == target){
            return peakElement;
        }

        // left side 
        int l = 0;
        int r = peakElement;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int currValue = mountainArr.get(mid);

            if (currValue == target) {
                return mid;
            }

            if (currValue > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        // right side
        l = peakElement;
        r = length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int currValue = mountainArr.get(mid);

            if (currValue == target) {
                return mid;
            }

            if (currValue > target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }
}