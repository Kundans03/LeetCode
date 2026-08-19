class Solution {
    public int maximumWealth(int[][] accounts) {
        int heighestWealth = 0;
        for (int customer = 0; customer < accounts.length; customer++) {
            int netWealth = 0;
            for (int bank = 0; bank < accounts[customer].length; bank++) {
                netWealth += accounts[customer][bank];
            }
            if (netWealth > heighestWealth)
                heighestWealth = netWealth;
        }
        return heighestWealth;
    }
}