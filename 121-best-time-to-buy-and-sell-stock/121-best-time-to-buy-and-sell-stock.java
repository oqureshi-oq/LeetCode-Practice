class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) return 0;
        
        int buyPrice = prices[prices.length-1]; 
        int profit = 0; 
        
        for(int i = prices.length-2; i >= 0; i--){
            profit = Math.max(profit, buyPrice - prices[i]); 
            buyPrice = Math.max(buyPrice, prices[i]); 
        }
        
        return profit; 
    }
}