class Solution {
    public int maxProfit(int[] prices) {
        int maxProft = 0;
        int minPrice = prices[0];
        int n = prices.length;

        for (int i = 1; i < n; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else{
                int profit = prices[i] - minPrice;
                if(profit > maxProft){
                    maxProft = profit;
                }
            }
        }
        return maxProft;
    }
}