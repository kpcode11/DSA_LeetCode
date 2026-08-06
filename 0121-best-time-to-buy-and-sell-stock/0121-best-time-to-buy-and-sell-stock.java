class Solution {
    public int maxProfit(int[] prices) {
        // int minprice = prices[0];
        // int rank = 0;
        // for (int i = 1; i <= prices.length - 1; i++) {
        //     if (prices[i] < minprice) {
        //         minprice = prices[i];
        //         rank = i;
        //     }
        // }
        // int maxval = prices[rank];
        // for (int j = rank; j <= prices.length - 1; j++) {
        //     if (prices[j] > maxval) {
        //         maxval = prices[j];
        //     }
        // }
        // int maxProfit = maxval - minprice;
        // return maxProfit;

        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i <= prices.length - 1; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }
}