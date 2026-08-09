class Solution {
    public int maxProfit(int[] prices) {
        //Dinamic
        int l = 0, ans = 0;
        for (int r = 0; r < prices.length; r++) {
            while (prices[r] < prices[l]) {
                l++;
            }
            ans = Math.max(ans, prices[r] - prices[l]);
        }
        return ans;
    }
}