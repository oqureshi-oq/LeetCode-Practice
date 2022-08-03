class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2)
            return 0;
        
        int maxProfit = 0; 
        int buyPrice = prices[0];
        
        for(int i = 1; i < prices.length; i++){
            maxProfit = Math.max(prices[i] - buyPrice, maxProfit); 
            if(prices[i] < buyPrice)
                buyPrice = prices[i];
        }
        
        return maxProfit; 
    }
}