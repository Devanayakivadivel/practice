class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minprice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
              if(prices[i]<minprice)
              minprice=prices[i];
              else if(prices[i]-minprice>profit)
              profit=prices[i]-minprice;
              }
            
        return profit;
    }
}