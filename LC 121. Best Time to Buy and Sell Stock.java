class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int profit = 0;
        int check = prices[0];
        for(int i=1;i<prices.length;i++) {
            profit = prices[i] - check;
            if(profit>0) {
                maxPro = Math.max(maxPro,profit);
            }
            else {
                check = prices[i];
            }
        }
        return maxPro;
    }
}
