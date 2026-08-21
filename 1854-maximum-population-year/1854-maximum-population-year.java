class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];

        for (int[] log : logs) {
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }

        for (int i = 1; i < years.length; i++) {
            years[i] += years[i - 1];
        }

        // System.out.print(Arrays.toString(years));

        int maxPopYear = -1;
        int maxPop = -1;
        for (int i = 0; i < years.length; i++) {
            if (years[i] > maxPop) {
                maxPopYear = 1950 + i;
                maxPop = years[i];
            }
        }
        // System.out.print(maxPopYear);
        return maxPopYear;
    }
}