class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null)
            return 0;
        
        int buy = prices[0];
        int maxProfit = 0; 
        
        for(int i = 1; i < prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i] - buy); 
            if(buy > prices[i])
                buy = prices[i]; 
        }
        
        return maxProfit; 
    }
}