class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freqArr1 = new int[1001];
        int[] freqArr2 = new int[1001];

        for (int idx = 0; idx < nums1.length; idx++) {
            freqArr1[nums1[idx]]++;
        }

        for (int idx = 0; idx < nums2.length; idx++) {
            freqArr2[nums2[idx]]++;
        }

        List<Integer> temp = new ArrayList<>();

        for (int idx = 0; idx < freqArr1.length; idx++) {
            int count = Math.min(freqArr1[idx], freqArr2[idx]);

            for (int i = 1; i <= count; i++) {
                temp.add(idx);
            }
        }

        int[] result = new int[temp.size()];

        int j = 0;
        for (int item : temp) {
            result[j++] = item;
        }

        return result;

    }
}