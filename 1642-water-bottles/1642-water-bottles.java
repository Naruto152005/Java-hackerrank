class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        /*
        this is using without maths technique
         */
//        int total = numBottles;  // total bottles drunk
//        int empty = numBottles;  // empty bottles we have now
//
//        while (empty >= numExchange) {
//            int newBottles = empty / numExchange;  // how many we can exchange
//            total += newBottles;                   // drink them
//            empty = empty % numExchange + newBottles; // leftover empties + new empties
//        }
//
//        return total;
        // this is using with math-formula;
        //total=num+(totalbottle-1)/(exchange_value-1)/2;
        /*
        numBottles=15 and exchange =4
        1)15+(15-1)/(4-1)
        2)15+(14/3)
        3)15+4
        4)ans=19;
         */
        return numBottles+(numBottles-1)/(numExchange-1);
    }
}