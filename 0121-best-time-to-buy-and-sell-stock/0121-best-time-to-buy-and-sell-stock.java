class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null  || prices.length < 2)
            return 0 ;
        
        int buyPrice = prices[0];
        int max = 0;
        
        for(int todayPrice: prices){
            max = Math.max(todayPrice-buyPrice, max);
            buyPrice = Math.min(buyPrice, todayPrice); 
        }
        
        return max; 
    }
}