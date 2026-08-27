class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] freqArr = new int[1001];

        for (int idx = 0; idx < nums1.length; idx++) {
            if (freqArr[nums1[idx]] == 0) {
                freqArr[nums1[idx]] = 1;
            }
        }

        for (int idx = 0; idx < nums2.length; idx++) {
            if (freqArr[nums2[idx]] == 1) {
                freqArr[nums2[idx]] = 2;
            }
        }

        List<Integer> finalList = new ArrayList<>();

        for (int idx = 0, j = 0; idx < freqArr.length; idx++) {
            if (freqArr[idx] > 1) {
                finalList.add(idx);
            }
        }

        int[] result = new int[finalList.size()];

        for (int i = 0; i < finalList.size(); i++) {
            result[i] = finalList.get(i);
        }

        return result;

    }
}