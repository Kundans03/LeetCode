class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = -1;
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies)
                maxCandies = candies[i];
        }

        for (int kid = 0; kid < candies.length; kid++) {
            int newCandiesCount = candies[kid] + extraCandies;
            result.add(newCandiesCount >= maxCandies);
        }

        return result;

    }
}