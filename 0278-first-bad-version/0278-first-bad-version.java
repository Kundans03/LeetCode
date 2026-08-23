/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        int badVersion = -1;

        while (left <= right) {
            int currentVersion = left + (right - left) / 2;
            boolean responce = isBadVersion(currentVersion);

            if (responce) {
                badVersion = currentVersion;
                right = currentVersion - 1;
            } else if (!responce) {
                left = currentVersion + 1;
            }
        }
        return badVersion;
    }
}