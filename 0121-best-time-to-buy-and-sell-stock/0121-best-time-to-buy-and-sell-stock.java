class Solution {
    public int maxProfit(int[] prices) {
        int profit=Integer.MIN_VALUE;// this value is assining the possible minmum value// we can use this for finding the profit;
        int buyPrice=Integer.MAX_VALUE;// in this we assining the maximum value to find the minmum price to buy the stock like if 7>1
        // buyprice=1;       
        for(int i:prices){
            buyPrice=Math.min(buyPrice,i);// here we simple performing the task of finding the best lowest price to buy a stock;
            // if(buyprice>i)7>1
        // buyprice=i;
            profit=Math.max(profit,i-buyPrice);//2nd iteration(0,5-1)-->profit=4;
        }return profit;
    }
}