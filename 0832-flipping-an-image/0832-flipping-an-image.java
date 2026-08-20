class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] i : image) {

            for (int l = 0, r = i.length - 1; l < r; l++, r--) {
                int temp = i[r];
                i[r] = i[l];
                i[l] = temp;
            }

            for (int j = 0; j < i.length; j++) {
                if (i[j] == 0)
                    i[j] = 1;
                else
                    i[j] = 0;
            }
        }
        return image;
    }
}