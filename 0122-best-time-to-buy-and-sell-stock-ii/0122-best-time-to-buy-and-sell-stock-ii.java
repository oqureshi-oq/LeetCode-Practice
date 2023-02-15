class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2)
            return 0;
        
        int buyPrice = prices[0]; 
        int maxProfit = 0;
        
        for(int i = 1; i < prices.length; i++){ 
            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            } else {
                maxProfit += prices[i] - buyPrice; 
                buyPrice = prices[i]; 
            }
        }
        
        return maxProfit; 
    }
}