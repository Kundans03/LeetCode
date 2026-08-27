class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int candiesAliceHas = 0;
        int candiesBobHas = 0;

        for (int candies : aliceSizes) {
            candiesAliceHas += candies;
        }

        for (int candies : bobSizes) {
            candiesBobHas += candies;
        }

        int diff = (candiesBobHas - candiesAliceHas) / 2;

        Set<Integer> bobSet = new HashSet<>();

        for (int candies : bobSizes) {
            bobSet.add(candies);
        }

        for (int candies : aliceSizes) {
            if (bobSet.contains(candies + diff)) {
                // System.out.print(Arrays.toString(new int[]{candies,candies+diff}));
                // return;
                return new int[] { candies, candies + diff };
            }
        }

        // System.out.print(Arrays.toString(new int[]{}));
        // return;
        return new int[] {};
    }
}