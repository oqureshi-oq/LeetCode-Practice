class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null)
            return 0;
        
        int left = 0;
        int right = 1; 
        int maxProfit = 0;
        
        while(right < prices.length){
            maxProfit = Math.max(prices[right] - prices[left], maxProfit);
            if(prices[right] < prices[left])
                left = right; 
            right++; 
        }
        
        return maxProfit;
    }
}